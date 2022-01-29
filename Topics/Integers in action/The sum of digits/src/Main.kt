import kotlin.math.abs

fun main() {
    // put your code here

    // (I) read data from the input
    val threeDigitsInteger = readLine()!!.toInt()
    val ten = 10
    val hundred = 100

    // (II) process data | calculations
    val firstDigit = threeDigitsInteger / hundred
    val remainder = threeDigitsInteger % hundred

    val secondDigit = remainder / ten
    val thirdDigit = remainder % ten

    val sum = firstDigit + secondDigit + thirdDigit

    // (III) output the result(s)
    // println(Math.abs(sum))
    println(abs(sum))
}
