fun main() {
    // put your code here
    val char1 = readLine()!!.first()
    val char2 = readLine()!!.first()
    val char3 = readLine()!!.first()
    
    val areOrdered = char2 == char1 + 1 && char3 == char2 + 1
    
    println(areOrdered)
}
