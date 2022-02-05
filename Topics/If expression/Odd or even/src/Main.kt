fun main() {
    // write your code here
    val number = readLine()!!.toInt()
    
    val isOddOrEven = if (number % 2 == 0) {
        "EVEN"
    } else {
        "ODD"
    }
    println(isOddOrEven)
}
