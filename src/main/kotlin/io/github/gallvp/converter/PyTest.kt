package io.github.gallvp.converter

import java.util.ArrayList

data class PyTest(
    val name: String, val assignments: ArrayList<Assignment> =
        ArrayList(), val expressions: ArrayList<Expression> = ArrayList()
) {

    fun variableAssignedValue(variableName: String): String? {

        val variableNameWithoutOperators = variableName.split(".").first()
        val operators = variableName.split(".").drop(1).joinToString(".")
        val assignedValue =
            this.assignments.firstOrNull { variableNameWithoutOperators == it.variableName }?.variableAssignment

        return if (operators == "") assignedValue else "$assignedValue.$operators"
    }

    fun variableHasAssignedValue(variableName: String): Boolean {
        return this.assignments.any { variableName.split(".").first() == it.variableName }
    }

    companion object {
        data class Assignment(val variableName: String, val variableAssignment: String)
        data class Expression(val component: String, val arguments: List<String>)
    }
}