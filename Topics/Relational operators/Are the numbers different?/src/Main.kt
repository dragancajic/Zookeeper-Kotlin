fun main() {
    // put your code here
    val firstNumber = readLine()!!.toInt()
    val secondNumber = readLine()!!.toInt()
    val thirdNumber = readLine()!!.toInt()
    
    val areDifferent = firstNumber != secondNumber &&
        firstNumber != thirdNumber && secondNumber != thirdNumber
    
    println(areDifferent)
}
