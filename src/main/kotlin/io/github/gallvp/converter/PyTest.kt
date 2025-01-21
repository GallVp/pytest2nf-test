package io.github.gallvp.converter

import java.util.ArrayList

data class PyTest(
    val name: String, val assignments: ArrayList<Assignment> =
        ArrayList(), val expressions: ArrayList<Expression> = ArrayList()
) {

    fun variableAssignedValue(variableName: String): String? {
        return this.assignments.firstOrNull { it.variableName == variableName }?.variableAssignment
    }

    fun variableHasAssignedValue(variableName: String): Boolean {
        return this.assignments.any { it.variableName == variableName }
    }

    companion object {
        data class Assignment(val variableName: String, val variableAssignment: String)
        data class Expression(val component: String, val arguments: List<String>)
    }
}