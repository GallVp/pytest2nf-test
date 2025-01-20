package io.github.gallvp.converter

import nextflow.script.parser.ScriptParser.*
import nextflow.script.parser.ScriptParser.WorkflowDefContext
import nextflow.script.parser.ScriptParserBaseListener
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.*

class PyTestListener internal constructor() : ScriptParserBaseListener() {
    private var tests: Stack<PyTest> = Stack()

    override fun enterWorkflowDef(ctx: WorkflowDefContext) {
        val testName = ctx.name.text
        logger.debug("Picked workflow name: $testName")

        tests.push(PyTest(testName))
    }

    override fun exitWorkflowDef(ctx: WorkflowDefContext) {
        logger.info("Picked PyTest: {}", tests.peek().name)

        logger.debug("{}", tests.peek())
        logger.debug("Equivalent nf-test: \n{}", tests.peek().nfTest)
    }

    override fun enterAssignmentStatement(ctx: AssignmentStatementContext) {
        val assignment = Assignment(ctx.left.text, ctx.right.text)
        logger.debug("Picked assignment: {}", assignment)
        tests.peek().assignments.add(assignment)
    }

    override fun enterExpressionStatement(ctx: ExpressionStatementContext) {
        val expression = ctx.expression
        if (expression.children.size != 2) {
            logger.debug("Expression ${expression.text} children size is ${ctx.expression.children.size}, skipping!")
            return
        }

        val invokedComponent = expression.children[0]
        val componentArguments =
            (expression.children[1] as ArgumentsPathExprAltContext).arguments().argumentList().argumentListElement()
                .map {
                    it.text.trim()
                }

        logger.debug("Invoked component: ${invokedComponent.text}")
        logger.debug("Component arguments: {}", componentArguments)

        tests.peek().expressions.add(Expression(invokedComponent.text, componentArguments))

    }

    data class PyTest(
        val name: String, val assignments: ArrayList<Assignment> =
            ArrayList(), val expressions: ArrayList<Expression> = ArrayList()
    ) {

        private fun getAssignedValue(variableName: String) : String? {
            return this.assignments.firstOrNull { it.variableName == variableName }?.variableAssignment
        }

        private fun hasAssignedValue(variableName: String) : Boolean {
            return this.assignments.any { it.variableName == variableName }
        }

        val nfTest: NFTest
            get() {
                val whenBlock = this.expressions.first().arguments.map { arg ->
                    val argValue = if (hasAssignedValue(arg)) {
                        getAssignedValue(arg)
                    } else {
                        arg
                    }
                    argValue ?: "FAILED TO GET VALUE FOR $arg"
                }.mapIndexed { i, argValue ->
                    "input[${i}] = $argValue"
                }.joinToString("\n")

                val thenBlock = """
                    assertAll(
                        { assert process.success },
                        { assert snapshot(process.out).match() }
                    )
                """.trimIndent()

                return NFTest(this.name, whenBlock, thenBlock)
            }
    }

    data class NFTest(val name: String, val whenBlock: String, val thenBlock: String) {
        override fun toString(): String {
            return """
                |test("$name") {
                |    when {
                |       process {
                |           \"\"\"
                |           $whenBlock
                |           \"\"\"
                |       }
                |    }
                |    then {
                |       $thenBlock
                |    }
                |}
            """.trimMargin()
        }
    }

    data class Assignment(val variableName: String, val variableAssignment: String)
    data class Expression(val component: String, val arguments: List<String>)

    companion object {
        private val logger: Logger = LoggerFactory.getLogger(PyTestListener::class.java)
    }
}