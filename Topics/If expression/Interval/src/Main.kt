fun main() {
    // write your code here
    val number = readLine()!!.toInt()
    
    // s u g g e s t i o n : Two comparisons should be converted to a range check !
    // if (number > -15 && number <= 12 || number in 15..16 || number >= 19) {
    if (number > -15 && number <= 12 || number > 14 && number < 17 || number >= 19) {
        println("True")
    } else {
        println("False")
    }
}
