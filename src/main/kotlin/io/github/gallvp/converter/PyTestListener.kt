package io.github.gallvp.converter

import nextflow.script.parser.ScriptParser
import nextflow.script.parser.ScriptParser.WorkflowDefContext
import nextflow.script.parser.ScriptParserBaseListener
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.*

class PyTestListener internal constructor(var componentName: String) : ScriptParserBaseListener() {
    private var tests: Stack<PyTest> = Stack()

    init {
        tests.push(PyTest())
    }

    override fun enterWorkflowDef(ctx: WorkflowDefContext) {
        val testName = ctx.name.text
        logger.debug("Picked workflow name: $testName")

        tests.peek().testName = testName
    }

    override fun enterAssignmentStatement(ctx: ScriptParser.AssignmentStatementContext) {
        val assignment = Assignment(ctx.left.text, ctx.right.text)
        logger.debug("Picked assignment: {}", assignment)
        tests.peek().assignments.add(assignment)
    }

    override fun enterExpressionStatement(ctx: ScriptParser.ExpressionStatementContext) {
        for (child in ctx.expression.children) {
            println(child.javaClass.name)
        }
    }

    class PyTest internal constructor() {
        var testName: String? = null
        var assignments: ArrayList<Assignment> =
            ArrayList()
    }

    @JvmRecord
    data class Assignment(val variableName: String, val variableAssignment: String)
    companion object {
        private val logger: Logger = LoggerFactory.getLogger(PyTestListener::class.java)
    }
}