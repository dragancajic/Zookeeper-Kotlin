fun main() {
    // put your code here
    val threeDigitNumber = readLine()!!.toInt()
    val hundred = 100
    val ten = 10
    
    val firstDigit = threeDigitNumber / hundred
    val remainder = threeDigitNumber % hundred
    
    val secondDigit = remainder / ten
    val thirdDigit = remainder % ten
    
    println(thirdDigit * 100 + secondDigit * 10 + firstDigit)
}
