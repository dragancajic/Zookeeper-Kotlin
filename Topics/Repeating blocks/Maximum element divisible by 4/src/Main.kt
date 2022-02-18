fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var max = 0
    
    repeat(n) {
        val number = readLine()!!.toInt()
        if (number % 4 == 0 && max < number) {
            max = number
        }
    }
    println(max)
}
