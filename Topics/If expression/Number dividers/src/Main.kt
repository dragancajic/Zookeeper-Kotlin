fun main() {
    // put your code here
    val number = readLine()!!.toInt()
    
    // TODO Refactor to methods!
    val isDivisible = if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
        """
            Divided by 2
            Divided by 3
            Divided by 5
            Divided by 6
        """.trimIndent()
    } else if (number % 2 == 0 && number % 3 == 0) {
        """
            Divided by 2
            Divided by 3
            Divided by 6
        """.trimIndent()
    } else if (number % 2 == 0 && number % 5 == 0) {
        """
            Divided by 2
            Divided by 5
        """.trimIndent()
    } else if (number % 3 == 0 && number % 5 == 0) {
        """
            Divided by 3
            Divided by 5
        """.trimIndent()
    } else if (number % 5 == 0) {
        """
            Divided by 5
        """.trimIndent()
    } else if (number % 3 == 0) {
        """
            Divided by 3
        """.trimIndent()
    } else if (number % 2 == 0) {
        """
            Divided by 2
        """.trimIndent()
    } else {
        ""
    }
    println(isDivisible)
}
