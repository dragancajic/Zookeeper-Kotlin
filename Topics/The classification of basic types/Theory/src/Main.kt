// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
    // put your code here
    val longNumber1 = 1_000_000_000_000_000
    val longNumber2: Long = 1_000_000
    val longNumber3 = 1000L

    val result = longNumber1 + longNumber2 - longNumber3
    println(result) // 1000000000999000 | 1000_000_000_999_000
}
