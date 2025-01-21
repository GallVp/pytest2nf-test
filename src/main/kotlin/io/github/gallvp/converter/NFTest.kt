package io.github.gallvp.converter

data class NFTest(val name: String, val whenBlock: String, val thenBlock: String) {
    override fun toString(): String {
        return """
                |test("$name") {
                |    when {
                |        process {
                |            ${"\"\"\""}
                |${whenBlock.split("\n").joinToString("\n") { "            $it" }}
                |            ${"\"\"\""}
                |        }    
                |    }
                |    then {
                |${thenBlock.split("\n").joinToString("\n") { "        $it" }}
                |    }
                |}
            """.trimMargin()
    }

    companion object {
        fun from(pyTest: PyTest): NFTest {
            val whenBlock = pyTest.expressions.first().arguments.map { arg ->
                val argValue = if (pyTest.variableHasAssignedValue(arg)) {
                    pyTest.variableAssignedValue(arg)
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

            val thenBlock = """
                |assertAll(
                |    { assert process.success },
                |    { assert snapshot(process.out).match() }
                |)
                """.trimMargin()

            return NFTest(pyTest.name, whenBlock, thenBlock)
        }
    }
}

