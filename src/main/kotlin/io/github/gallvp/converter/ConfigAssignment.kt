package io.github.gallvp.converter

data class ConfigAssignment(
    val targetName: String,
    val assignments: List<String>,
    var isForTargetComponent: Boolean = false
)

fun List<ConfigAssignment>.getConfigText(includedComponents: List<IncludedComponent>): String {
    val selectorBlocks = this.map {
        val targetName = if (it.isForTargetComponent) {
            includedComponents.getRealName(it.targetName)
        } else {
            it.targetName
        }

        """
            |withName: "$targetName" {
            |    ${it.assignments.joinToString("\n") { "ext.args = " + "params.module_args" }}
            |}
        """.trimMargin()
    }

    return """
            |process {
            |${selectorBlocks.joinToString("\n\n").split("\n").joinToString("\n") { "    $it" }}
            |}
            |""".trimMargin()
}