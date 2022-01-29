fun main() {
    // put your code here
    val numberOne = readLine()!!.toInt()
    val numberTwo = readLine()!!.toInt()
    val numberThree = readLine()!!.toInt()
    
    val isOnlyOnePositive = numberOne > 0 && numberTwo <= 0 && numberThree <= 0 ||
        numberOne <= 0 && numberTwo > 0 && numberThree <= 0 ||
        numberOne <= 0 && numberTwo <= 0 && numberThree > 0
    
    println(isOnlyOnePositive)
}
