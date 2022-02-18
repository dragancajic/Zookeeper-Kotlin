fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var counter = 0
    
    repeat(n) {
        val number = readLine()!!.toInt()
        if (number > 0) {
            counter++
        }
    }
    println(counter)
}
