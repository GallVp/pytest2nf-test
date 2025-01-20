package io.github.gallvp.converter

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

