package io.github.gallvp.converter;

import static org.codehaus.groovy.runtime.DefaultGroovyMethods.println;

import java.io.IOException;
import java.nio.file.Paths;

import org.antlr.v4.runtime.*;

import groovyjarjarantlr4.runtime.tree.ParseTree;
import nextflow.script.parser.*;

public class TestConverter {
    public static void main(String[] args) {
        String testFileName = null;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("--test") && i + 1 < args.length) {
                testFileName = args[i + 1];
                break;
            }
        }

        if (testFileName == null) {
            System.err.println("Usage: java -jar TestConverter --test <filename>");
            System.exit(1);
        }

        try {
            CharStream charStream = CharStreams.fromPath(Paths.get(testFileName));
            
            ScriptLexer nextflowLexer = new ScriptLexer(charStream);
            CommonTokenStream tokens = new CommonTokenStream(nextflowLexer);
            ScriptParser nextflowParser = new ScriptParser(tokens);

            System.out.println(nextflowParser.compilationUnit().children);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}