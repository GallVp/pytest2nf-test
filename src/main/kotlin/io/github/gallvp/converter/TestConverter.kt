package io.github.gallvp.converter

import nextflow.script.parser.ScriptLexer
import nextflow.script.parser.ScriptParser
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.File
import java.io.IOException
import java.nio.file.Paths
import kotlin.system.exitProcess

object TestConverter {
    @kotlin.jvm.JvmStatic
    fun main(args: Array<String>) {
        var testPath: String? = null

        // Parse arguments
        for (i in args.indices) {
            if (args[i] == "--test" && i + 1 < args.size) {
                testPath = args[i + 1]
                break
            }
        }

        if (testPath == null) {
            System.err.println("Usage: java -jar TestConverter --test <test_folder>")
            exitProcess(1)
        }

        // Read main.nf from test folder
        val componentName = File(testPath).name
        var charStream: CharStream? = null
        try {
            charStream = CharStreams.fromPath(Paths.get("$testPath/main.nf"))
        } catch (ioException: IOException) {
            System.err.printf("Failed to read main.nf from %s\n", testPath)
            exitProcess(1)
        }


        // Parse test file
        val nextflowLexer = ScriptLexer(charStream)
        val tokens = CommonTokenStream(nextflowLexer)
        val nextflowParser = ScriptParser(tokens)
        val compilationUnit = nextflowParser.compilationUnit()

        // Walk the tree and pick items for nf-test
        val listener = PyTestListener(componentName)
        val extractor = ParseTreeWalker()
        extractor.walk(listener, compilationUnit)
    }
}