package io.github.gallvp.converter

import io.github.gallvp.converter.PyTest.Companion.Assignment
import io.github.gallvp.converter.PyTest.Companion.Expression
import nextflow.script.parser.ScriptParser.*
import nextflow.script.parser.ScriptParserBaseListener
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.io.File
import java.util.*
import kotlin.collections.ArrayList

class PyTestListener internal constructor(private val pyTestFile: File) : ScriptParserBaseListener() {
    val tests: Stack<PyTest> = Stack()
    val includedComponents: ArrayList<IncludedComponent> = ArrayList()

    override fun enterIncludeDeclaration(ctx: IncludeDeclarationContext?) {

        if (ctx == null) {
            logger.debug("Include declaration has missing context, skipping!")
            return
        }

        logger.debug("Picked include declaration: {}", ctx.text)

        val includeNames = ctx.includeNames().includeName()
        val includePath = ctx.stringLiteral()

        val invokedComponentAbsolutePath = File(pyTestFile.parent).resolve(File(includePath.text.replace("'", ""))).canonicalPath

        logger.debug("Included component absolute path: {}", invokedComponentAbsolutePath)

        includeNames.forEach { includeName ->
            val includedComponent = IncludedComponent(
                includeName.name.text,
                includeName?.alias?.text,
                invokedComponentAbsolutePath
            )
            logger.debug("Picked included component: {}", includedComponent)
            includedComponents.add(includedComponent)
        }
    }

    override fun enterWorkflowDef(ctx: WorkflowDefContext) {
        val testName = ctx.name.text
        logger.debug("Picked workflow name: $testName")

        tests.push(PyTest(testName))
    }

    override fun exitWorkflowDef(ctx: WorkflowDefContext) {
        logger.info("Picked PyTest: {}", tests.peek().name)
    }

    override fun enterAssignmentStatement(ctx: AssignmentStatementContext) {
        val assignment = Assignment(ctx.left.text, ctx.right.text)
        logger.debug("Picked assignment: {}", assignment)
        tests.peek().assignments.add(assignment)
    }

    override fun enterExpressionStatement(ctx: ExpressionStatementContext) {
        val expression = ctx.expression

        logger.debug(
            "Picked expression with children: {}",
            expression.children.map { it.javaClass.name.split("\$")[1] })

        if (expression.children.size != 2) {
            logger.debug("Expression ${expression.text} children size is ${ctx.expression.children.size}, skipping!")
            return
        }

        if (expression.children[1].javaClass.name.split("\$")[1] == "IndexPathExprAltContext") {
            logger.debug("Expression ${expression.text} is suspected to be a closure and ignored for now!")
            return
        }

        val invokedComponent = expression.children[0]

        logger.debug("Invoked component: ${invokedComponent.text}")

        val componentArguments =
            (expression.children[1] as ArgumentsPathExprAltContext).arguments().argumentList().argumentListElement()
                .map {
                    it.text.trim()
                }

        logger.debug("Component arguments: {}", componentArguments)

        tests.peek().expressions.add(Expression(invokedComponent.text, componentArguments))

    }

    companion object {
        private val logger: Logger = LoggerFactory.getLogger(PyTestListener::class.java)
    }
}