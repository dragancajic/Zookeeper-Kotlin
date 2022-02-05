fun main() {
    // write your code here
    val year = readLine()!!.toInt()
    
    val leapYear = if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        "Leap"
    } else {
        "Regular"
    }
    
    print(leapYear)
}
