package io.github.gallvp.converter

import nextflow.script.parser.ConfigLexer
import nextflow.script.parser.ConfigParser
import nextflow.script.parser.ScriptLexer
import nextflow.script.parser.ScriptParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.yaml.snakeyaml.DumperOptions
import java.io.File
import java.io.IOException
import java.nio.file.Paths
import java.util.regex.Pattern
import kotlin.system.exitProcess
import org.yaml.snakeyaml.Yaml

object TestConverter {
    @kotlin.jvm.JvmStatic
    fun main(args: Array<String>) {
        var componentMainPath: String? = null
        var testPath: String? = null
        var outputPath: String? = null
        var dataDictPath: String? = null
        var nfCoreModuleName: String? = null

        // Process args
        for (i in args.indices) {
            when (args[i]) {
                "--nf-core-module" -> if (i + 1 < args.size) nfCoreModuleName = args[i + 1]
                "--main" -> if (i + 1 < args.size) componentMainPath = args[i + 1]
                "--test" -> if (i + 1 < args.size) testPath = args[i + 1]
                "--output" -> if (i + 1 < args.size) outputPath = args[i + 1]
                "--data-dict" -> if (i + 1 < args.size) dataDictPath = args[i + 1]
            }
        }

        if ((componentMainPath.isNullOrBlank() || testPath.isNullOrBlank() || outputPath.isNullOrBlank()) && nfCoreModuleName.isNullOrBlank()) {
            System.err.println(
                """
                Usage:
                pytest2nf-test --nf-core-module tool/subtool
                e.g. pytest2nf-test --nf-core-module canu
                e.g. pytest2nf-test --nf-core-module elprep/merge
                Or,
                pytest2nf-test --main <main.nf> --test <test.nf> --output <main.nf.test>
            """.trimIndent()
            )
            exitProcess(1)
        }

        if (!nfCoreModuleName.isNullOrBlank() && (!componentMainPath.isNullOrBlank() || !testPath.isNullOrBlank() || !outputPath.isNullOrBlank())) {
            System.err.println(
                """
                Usage:
                pytest2nf-test --nf-core-module tool/subtool
                e.g. pytest2nf-test --nf-core-module canu
                e.g. pytest2nf-test --nf-core-module elprep/merge
                Or,
                pytest2nf-test --main <main.nf> --test <test.nf> --output <main.nf.test>
            """.trimIndent()
            )
            exitProcess(1)
        }

        if (!nfCoreModuleName.isNullOrBlank()) {
            componentMainPath = "modules/nf-core/${nfCoreModuleName}/main.nf"
            testPath = "tests/modules/nf-core/${nfCoreModuleName}/main.nf"
            outputPath = "modules/nf-core/${nfCoreModuleName}/tests/main.nf.test"
            dataDictPath = "tests/config/test_data.config"
        }

        if (componentMainPath.isNullOrBlank() || testPath.isNullOrBlank() || outputPath.isNullOrBlank()) {
            System.err.println(
                """
                Usage:
                pytest2nf-test --nf-core-module tool/subtool
                e.g. pytest2nf-test --nf-core-module canu
                e.g. pytest2nf-test --nf-core-module elprep/merge
                Or,
                pytest2nf-test --main <main.nf> --test <test.nf> --data-dict <data-dict.config> --output <main.nf.test>
            """.trimIndent()
            )
            exitProcess(1)
        }

        // Read files
        val componentMainFile = File(componentMainPath)
        val pyTestFile = File(testPath)
        val nfTestFile = File(outputPath)
        val dataDictFile = if (dataDictPath != null) File(dataDictPath) else null

        val mainFileRelativeToNFTestFile = componentMainFile.relativeTo(nfTestFile.parentFile)

        logger.debug("Component main file path relative to nf-test file path: {}", mainFileRelativeToNFTestFile)

        val mainFileText = componentMainFile.readText()
        val componentAttributes = Regex("\\s*(process|workflow)\\s+(\\w+)\\s*\\{").find(mainFileText)?.groupValues
        val componentName = componentAttributes?.get(2)?.lowercase()
        val componentType = componentAttributes?.get(1)?.lowercase()
        val componentHasStub = Regex("\\s*stub:\\s*").containsMatchIn(mainFileText)

        require(componentName != null && componentType != null) { "Could not find component name or type in $componentMainPath" }

        logger.info("Found $componentType: $componentName")

        // Parse pytest file
        val testFileCharStream = getCharStreamFromFile(testPath)
        val nextflowLexer = ScriptLexer(testFileCharStream)
        val tokens = CommonTokenStream(nextflowLexer)
        val nextflowParser = ScriptParser(tokens)
        val compilationUnit = nextflowParser.compilationUnit()

        // Walk the tree and pick items for nf-test
        val listener = PyTestListener(pyTestFile)
        val extractor = ParseTreeWalker()
        extractor.walk(listener, compilationUnit)

        // Parse nextflow.config file sitting next to pytest file
        val nextflowConfig = pyTestFile.parentFile.resolve("nextflow.config")

        var configAssignments: List<ConfigAssignment>? = null
        if (!nextflowConfig.exists()) {
            logger.debug("No nextflow.config file found in ${pyTestFile.parentFile.path}, skipping!")
        } else {
            val nextflowConfigCharStream = getCharStreamFromFile(nextflowConfig.path)

            val nextflowConfigLexer = ConfigLexer(nextflowConfigCharStream)
            val configTokens = CommonTokenStream(nextflowConfigLexer)
            val nextflowScriptParser = ConfigParser(configTokens)
            val configCompilationUnit = nextflowScriptParser.compilationUnit()

            // Walk the tree and pick items for nf-test
            val configListener = PyTestConfigListener()
            val configExtractor = ParseTreeWalker()
            configExtractor.walk(configListener, configCompilationUnit)

            configAssignments = configListener.configAssignments
        }

        // Parse data-dict file
        val dataDictMap: MutableMap<String, Any> = mutableMapOf()
        if (dataDictFile != null) {
            val dataDictCharStream = getCharStreamFromFile(dataDictFile.path)
            dataDictMap.putAll(extractTestData(dataDictCharStream.toString()))
        }
        
        // Populate a nf-test file
        val nfTests = listener.tests.toList()
            .map {
                NFTest.from(
                    it,
                    listener.includedComponents,
                    componentName,
                    componentType,
                    nfTestFile,
                    configAssignments,
                    dataDictMap,
                    componentHasStub,
                    false
                )
            }
            .toMutableList()

        if (componentHasStub) {
            nfTests += listener.tests.toList()
                .map {
                    NFTest.from(
                        it,
                        listener.includedComponents,
                        componentName,
                        componentType,
                        nfTestFile,
                        configAssignments,
                        dataDictMap,
                        true,
                        true
                    )
                }
        }

        val nfCoreTag = if (!nfCoreModuleName.isNullOrBlank() && componentType == "workflow") {
            "workflow_nfcore"
        } else if (!nfCoreModuleName.isNullOrBlank()) {
            "modules_nfcore"
        } else {
            null
        }

        val testTags = (listOf(if (componentType == "workflow") "subworkflows" else "modules", nfCoreTag) +
                listener.includedComponents.map {

                    if (componentType == "workflow" && it.name.lowercase() == componentName) {
                        return@map listOf(componentName)
                    }

                    val normalised = it.name.lowercase().replace("_", "/")
                    val component = if (normalised.contains("/")) {
                        normalised.split("/")[0]
                    } else {
                        normalised
                    }
                    val subComponent = if (normalised.contains("/")) {
                        normalised
                    } else {
                        null
                    }

                    listOf(component, subComponent)
                }.flatten()).filterNotNull().toSet().toList()

        val componentNFTest = ComponentNFTest(
            componentName,
            componentType,
            mainFileRelativeToNFTestFile.toString(),
            nfTests,
            !configAssignments.isNullOrEmpty(),
            testTags
        )

        nfTestFile.parentFile.mkdirs()
        nfTestFile.writeText(componentNFTest.fileText)

        logger.info("Saved nf-test file to ${nfTestFile.path}")

        // Populate a nf-test config file
        if (!configAssignments.isNullOrEmpty()) {
            val configFile = nfTestFile.parentFile.resolve("nextflow.config")
            configFile.writeText(configAssignments.getConfigText(listener.includedComponents))

            logger.info("Saved nf-test config file to ${configFile.path}")
        }

        // Delete the test directory if it is nf-core/module
        if (!nfCoreModuleName.isNullOrBlank()) {
            val pyTestDirectory = pyTestFile.parentFile

            logger.info("Deleting $pyTestDirectory")

            pyTestDirectory.deleteRecursively()
        }

        // Delete the pytest entry from tests yml
        if (!nfCoreModuleName.isNullOrBlank()) {
            deleteYamlKey(nfCoreModuleName)
        }
    }

    private fun getCharStreamFromFile(filePath: String): CharStream? {
        return try {
            CharStreams.fromPath(Paths.get(filePath))
        } catch (e: IOException) {
            e.printStackTrace()
            null
        }
    }

    private fun extractTestData(configContent: String): Map<String, Any> {
        val startIndex = configContent.indexOf("test_data {")
        if (startIndex == -1) {
            logger.error("Failed to find 'test_data' block in the config content")
            return emptyMap()
        }

        var bracketCount = 1
        var endIndex = startIndex
        for (i in startIndex until configContent.length) {
            when (configContent[i]) {
                '{' -> bracketCount++
                '}' -> bracketCount--
            }
            if (bracketCount == 0) {
                endIndex = i
                break
            }
        }

        if (bracketCount != 0) {
            logger.error("Unmatched brackets in 'test_data' block")
            return emptyMap()
        }

        val testDataContent = configContent.substring(startIndex + 10, endIndex).trim() // Extract content inside `test_data { ... }`
        val resolvedTestDataContent = resolveTestDataReferences(testDataContent)
        val testDataMap = parseTestData(resolvedTestDataContent)
        return testDataMap
    }

    private fun parseTestData(data: String): Map<String, Any> {
        val result = mutableMapOf<String, Any>()
        
        // Regular expression to match the 'key' structure (e.g., 'sarscov2 {')
        val keyPattern = Pattern.compile("'?([^']+)'? \\{")
        // Regular expression to match the assignment of keys to values (e.g., key = "value")
        val assignmentPattern = Pattern.compile("([^\\s=]+)\\s*=\\s*\"([^\"]+)\"")

        val stack = mutableListOf<MutableMap<String, Any>>()
        var currentMap = result // Start with the root result map

        // Split the input into lines and process each line
        val lines = data.lines()

        for (line in lines) {
            val trimmedLine = line.trim()

            // Match the start of a new block (e.g., 'sarscov2 {')
            val keyMatcher = keyPattern.matcher(trimmedLine)
            if (keyMatcher.matches()) {
                val newKey = keyMatcher.group(1)
                val newMap = mutableMapOf<String, Any>()
                currentMap[newKey] = newMap
                stack.add(currentMap)
                currentMap = newMap
                continue
            }

            // Match the assignment of key-value pairs (e.g., key = "value")
            val assignmentMatcher = assignmentPattern.matcher(trimmedLine)
            if (assignmentMatcher.matches()) {
                val subKey = assignmentMatcher.group(1)
                val subValue = assignmentMatcher.group(2)
                currentMap[subKey] = subValue
                continue
            }

            // Handle the closing of a block (e.g., '}')
            if (trimmedLine == "}") {
                if (stack.isNotEmpty()) {
                    currentMap = stack.removeAt(stack.size - 1)
                }
            }
        }

        return result
    }

    private fun resolveTestDataReferences(value: String): String {
        val regex = Regex("""\$\{params\.test_data_base\}\/data\/(.*)""")
        return regex.replace(value) { match ->
            // Replace the placeholder with the proper string format
            // The correct result should be: params.modules_testdata_base_path + '/<path>'
            val pathAfterData = match.groupValues[1]
            val cleanedPath = pathAfterData.trimEnd('"')
            "params.modules_testdata_base_path + \'$cleanedPath\'\""
        }
    }

    private fun deleteYamlKey(keyToDelete: String) {

        val options = DumperOptions().apply {
            defaultFlowStyle = DumperOptions.FlowStyle.BLOCK
            indent = 4
            indicatorIndent = 2
            defaultScalarStyle = DumperOptions.ScalarStyle.PLAIN
        }

        val yaml = Yaml(options)
        val file = File("tests/config/pytest_modules.yml")

        val data: MutableMap<String, Any> = yaml.load(file.readText()) ?: mutableMapOf()

        if (data.remove(keyToDelete) != null) {
            logger.info("Key '$keyToDelete' removed successfully from pytest_modules.yml")
        } else {
            logger.debug("Key '$keyToDelete' not found in pytest_modules.yml")
        }

        file.writeText(yaml.dump(data))
    }

    private val logger: Logger = LoggerFactory.getLogger(TestConverter::class.java)
}