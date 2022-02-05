fun main() {
    // write your code here
    val number = readLine()!!.toInt()
    
    val signOfNumber = if (number < 0) {
        "negative"
    } else if (number == 0) {
        "zero"
    } else {
        "positive"
    }
    
    println(signOfNumber)
}
