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
import java.io.File
import java.io.IOException
import java.nio.file.Paths
import kotlin.system.exitProcess

object TestConverter {
    @kotlin.jvm.JvmStatic
    fun main(args: Array<String>) {
        var componentMainPath: String? = null
        var testPath: String? = null
        var outputPath: String? = null

        // Process args
        for (i in args.indices) {
            when (args[i]) {
                "--main" -> if (i + 1 < args.size) componentMainPath = args[i + 1]
                "--test" -> if (i + 1 < args.size) testPath = args[i + 1]
                "--output" -> if (i + 1 < args.size) outputPath = args[i + 1]
            }
        }

        if (componentMainPath.isNullOrBlank() || testPath.isNullOrBlank() || outputPath.isNullOrBlank()) {
            System.err.println(
                """
                Usage: TestConverter --main <main.nf> --test <test.nf> --output <main.nf.test>
            """.trimIndent()
            )
            exitProcess(1)
        }

        // Read files
        val pyTestFile = File(testPath)
        val componentMainFile = File(componentMainPath)
        val nfTestFile = File(outputPath)

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
                        true,
                        true
                    )
                }
        }

        val testTags =
            listOf(if (componentType == "workflow") "subworkflows" else "modules") + listener.includedComponents.map {

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
            }.flatten().filterNotNull().toSet()

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
            val configFile = nfTestFile.parentFile.resolve("nextflow.test.config")
            configFile.writeText(configAssignments.getConfigText(listener.includedComponents))

            logger.info("Saved nf-test config file to ${configFile.path}")
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

    private val logger: Logger = LoggerFactory.getLogger(TestConverter::class.java)
}