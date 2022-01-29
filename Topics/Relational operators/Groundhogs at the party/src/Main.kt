fun main() {
    // write your code here
    val cups = readLine()!!.toInt()
    val isWeekend = readLine()!!.toBoolean()
    
    val isPartySuccessful = isWeekend && cups <= 25 && cups >= 15 ||
        !isWeekend && cups <= 20 && cups >= 10
    
    println(isPartySuccessful)
}
