fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    // put your code here
    var maximum = a
    if (a < b) {
        maximum = b
    }
    println(maximum)
}
