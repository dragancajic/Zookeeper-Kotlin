fun main() {
    // put your code here
    val firstNumber = readLine()!!.toInt()
    val secondNumber = readLine()!!.toInt()
    val thirdNumber = readLine()!!.toInt()
    
    val inRange = firstNumber >= secondNumber && firstNumber <= thirdNumber ||
        firstNumber <= secondNumber && firstNumber >= thirdNumber
    
    println(inRange)
    // or
    // println(firstNumber in secondNmber..thirdNumber)
}
