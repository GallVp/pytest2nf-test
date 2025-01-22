package io.github.gallvp.converter

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.io.File

data class NFTest(
    val name: String,
    val whenBlock: String,
    val thenBlock: String,
    val setupBlock: String? = null,
    val addStubOption: Boolean = false
) {
    override fun toString(): String {

        val setupBlockComplete = setupBlock?.let { setup ->
            """
                |setup {
                |${setup.split("\n").joinToString("\n") { "    $it" }}
                |}
            """.trimMargin()
        } ?: ""

        val stubOptionText = if (addStubOption) "options '-stub'" else ""
        val stubNamePostfix = if (addStubOption) " -- stub" else ""

        return """
                |test("$name$stubNamePostfix") {
                |    $stubOptionText
                |${setupBlockComplete.split("\n").joinToString("\n") { "    $it" }}
                |${whenBlock.split("\n").joinToString("\n") { "    $it" }}
                |${thenBlock.split("\n").joinToString("\n") { "    $it" }}
                |}
            """.trimMargin()
    }

    companion object {
        fun from(
            pyTest: PyTest,
            includedComponents: List<IncludedComponent>,
            componentName: String,
            nfTestFile: File,
            configAssignments: List<ConfigAssignment>?,
            addStubOption: Boolean
        ): NFTest {
            val targetComponentExpression = pyTest.expressions.filter { it.component.lowercase() == componentName }

            require(targetComponentExpression.size == 1) {
                "None of the expressions in pytest ${pyTest.name} matches the component name $componentName"
            }

            logger.debug(
                "Building inputs block for {} with arguments: {}",
                pyTest.name,
                targetComponentExpression.first().arguments
            )

            val inputs = targetComponentExpression.first().arguments.let { args ->
                pyTestArgumentsToNFTestInputs(pyTest, args)
            }

            val inputsBlock = """
                |process {
                |    ${"\"\"\""}
                |${inputs.split("\n").joinToString("\n") { "    $it" }}
                |    ${"\"\"\""}
                |}
            """.trimMargin()

            val testProcessConfigAssignments = configAssignments?.filter {
                it.targetName == targetComponentExpression.first().component
            }

            logger.debug("Picked test process config assignments: {}", testProcessConfigAssignments)

            val testProcessConfigAssignmentsBlock = if (testProcessConfigAssignments.isNullOrEmpty()) {
                ""
            } else {
                """
                    |params {
                    |    module_args = ${testProcessConfigAssignments.first().assignments.first().split("=").last()}
                    |}
                """.trimMargin()
            }

            val whenBlock = """
                |when {
                |${testProcessConfigAssignmentsBlock.split("\n").joinToString("\n") { "    $it" }}
                |${inputsBlock.split("\n").joinToString("\n") { "    $it" }}
                |}
            """.trimMargin()

            val setupComponents = pyTest.expressions.filter { it.component.lowercase() != componentName }

            logger.debug("Setup components: {}", setupComponents.map { it.component })

            val setupBlock = if (setupComponents.isEmpty()) {
                null
            } else {
                setupComponents.joinToString("\n\n") { expression ->
                    val invokedComponentName = expression.component
                    val componentArguments = expression.arguments

                    logger.debug("Setup component: {} with arguments: {}", invokedComponentName, componentArguments)

                    val invokedComponentRealName = includedComponents.getRealName(invokedComponentName)
                    val invokedComponentAlias =
                        if (invokedComponentRealName != invokedComponentName) invokedComponentName else null
                    val aliasStatement = invokedComponentAlias?.let { ", alias: \"$invokedComponentAlias\"" } ?: ""

                    val invokedComponentPath =
                        includedComponents.find { it.name == invokedComponentRealName }?.absolutePath ?: ""

                    logger.debug(
                        "Making path: {} relative to nf-test file: {}",
                        invokedComponentPath,
                        nfTestFile.absolutePath
                    )

                    val invokedComponentRelativePath =
                        File(invokedComponentPath).relativeTo(nfTestFile.parentFile.absoluteFile).path

                    val formattedInputs = pyTestArgumentsToNFTestInputs(pyTest, componentArguments).split("\n")
                        .joinToString("\n") { "        $it" }

                    val setupProcessConfigAssignments = configAssignments?.filter {
                        it.targetName == invokedComponentName
                    }

                    logger.debug("Picked setup process config assignments: {}", setupProcessConfigAssignments)

                    val setupProcessConfigAssignmentsBlock = if (setupProcessConfigAssignments.isNullOrEmpty()) {
                        ""
                    } else {
                        """
                        |params {
                        |    module_args = ${
                            setupProcessConfigAssignments.first().assignments.first().split("=").last()
                        }
                        |}
                        |""".trimMargin()
                    }

                    """
                    |run("$invokedComponentRealName"$aliasStatement) {
                    |    script "$invokedComponentRelativePath"
                    |${setupProcessConfigAssignmentsBlock.split("\n").joinToString("\n") { "    $it" }}
                    |    process {
                    |        ${"\"\"\""}
                    |$formattedInputs
                    |        ${"\"\"\""}
                    |    }
                    |}
                """.trimMargin()
                }
            }


            val thenBlock = """
                |then {
                |    assertAll(
                |        { assert process.success },
                |        { assert snapshot(process.out).match() }
                |    )
                |}
                """.trimMargin()

            return NFTest(pyTest.name, whenBlock, thenBlock, setupBlock, addStubOption)
        }

        private fun pyTestArgumentsToNFTestInputs(pyTest: PyTest, arguments: List<String>): String =
            arguments.map { arg ->
                val argValue = if (pyTest.variableHasAssignedValue(arg)) {
                    val assignedValue = pyTest.variableAssignedValue(arg)
                    logger.debug("Picked assigned value for $arg: $assignedValue")
                    assignedValue
                } else {
                    arg
                }
                argValue ?: "FAILED TO GET VALUE FOR $arg"
            }.mapIndexed { i, argValue ->
                if (argValue.contains("\n")) {
                    """
                        |input[${i}] = ${argValue.replace("\n", "\n    ")}
                    """.trimMargin()
                } else {
                    "input[${i}] = $argValue"
                }
            }.joinToString("\n")

        private val logger: Logger = LoggerFactory.getLogger(NFTest::class.java)
    }
}

