fun main() {
    // write your code here
    val number = readLine()!!.toInt()
    
    val isPositive = if (number > 0) {
        "YES"
    } else {
        "NO"
    }
    
    println(isPositive)
}
