fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0
    
    repeat(n) {
        val part = readLine()!!.toInt()
        
        if (part == 1) {
            larger++
        }
        
        if (part == -1) {
            smaller++
        }
        
        if (part == 0) {
            perfect++
        }
    }
    println("$perfect $larger $smaller")
}
