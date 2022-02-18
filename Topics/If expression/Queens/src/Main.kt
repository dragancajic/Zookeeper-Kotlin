import kotlin.math.abs

fun main() {
    // write your code here
    val x1y1 = readLine()!!.split(" ")
    val x1 = x1y1[0].toInt()
    val y1 = x1y1[1].toInt()
    
    val x2y2 = readLine()!!.split(" ")
    val x2 = x2y2[0].toInt()
    val y2 = x2y2[1].toInt()
    
    if (x1 == x2 || y1 == y2) {
        println("YES")
    } else if (abs(x1 - x2) == abs(y1 - y2)) {
        println("YES")
    } else {
        println("NO")
    }
}
