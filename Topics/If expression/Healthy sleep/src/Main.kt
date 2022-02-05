fun main() {    
    // write your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val h = readLine()!!.toInt()
    
    if (h < a) {
        println("Deficiency")
    } else if (h > b) {
        println("Excess")
    } else {
        println("Normal")
    }
}
