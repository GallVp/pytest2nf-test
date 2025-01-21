package io.github.gallvp.converter

import java.util.ArrayList

data class PyTest(
    val name: String, val assignments: ArrayList<Assignment> =
        ArrayList(), val expressions: ArrayList<Expression> = ArrayList()
) {

    private fun getAssignedValue(variableName: String): String? {
        return this.assignments.firstOrNull { it.variableName == variableName }?.variableAssignment
    }

    private fun hasAssignedValue(variableName: String): Boolean {
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
                if ( argValue.contains("\n") ) {
                    """
                        |input[${i}] = ${argValue.replace("\n", "\n    ")}
                    """.trimMargin()
                } else {
                    "input[${i}] = $argValue"
                }
            }.joinToString("\n")

            val thenBlock = """
                |assertAll(
                |    { assert process.success },
                |    { assert snapshot(process.out).match() }
                |)
                """.trimMargin()

            return NFTest(this.name, whenBlock, thenBlock)
        }

    companion object {
        data class Assignment(val variableName: String, val variableAssignment: String)
        data class Expression(val component: String, val arguments: List<String>)
    }
}