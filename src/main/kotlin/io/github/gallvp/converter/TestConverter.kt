package io.github.gallvp.converter

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
        var mainPath: String? = null
        var testPath: String? = null

        // Process args
        for (i in args.indices) {
            when (args[i]) {
                "--main" -> if (i + 1 < args.size) mainPath = args[i + 1]
                "--test" -> if (i + 1 < args.size) testPath = args[i + 1]
            }
        }

        if (mainPath.isNullOrBlank() || testPath.isNullOrBlank()) {
            System.err.println(
                """
                Usage: TestConverter --main <main.nf> --test <test.nf>
            """.trimIndent()
            )
            exitProcess(1)
        }

        // Read files
        val testFile = File(testPath)
        val mainFile = File(mainPath)
        val mainFileRelativePath = mainFile.relativeTo(testFile.parentFile)

        val mainFileText = mainFile.readText()
        val componentAttributes = Regex("\\s*(process|workflow)\\s+(\\w+)\\s*\\{").find(mainFileText)?.groupValues
        val componentName = componentAttributes?.get(2)?.lowercase()
        val componentType = componentAttributes?.get(1)?.lowercase()

        require(componentName != null && componentType != null) { "Could not find component name or type in $mainPath" }

        logger.info("Found $componentType: $componentName")

        // Parse test file
        val testFileCharStream = getCharStreamFromFile(testPath)
        val nextflowLexer = ScriptLexer(testFileCharStream)
        val tokens = CommonTokenStream(nextflowLexer)
        val nextflowParser = ScriptParser(tokens)
        val compilationUnit = nextflowParser.compilationUnit()

        // Walk the tree and pick items for nf-test
        val listener = PyTestListener()
        val extractor = ParseTreeWalker()
        extractor.walk(listener, compilationUnit)

        // Populate a nf-test file
        val componentNFTest = ComponentNFTest(
            componentName,
            componentType,
            mainFileRelativePath.toString(),
            listener.tests.toList().map { NFTest.from(it, componentName) })
        File(testFile.parent.plus("/main.nf.test")).writeText(componentNFTest.fileText)

        logger.info("Saved nf-test file to ${testFile.parent.plus("/main.nf.test")}")
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