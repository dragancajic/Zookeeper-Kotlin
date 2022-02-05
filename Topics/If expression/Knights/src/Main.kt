// import java.lang.Math.abs
import kotlin.math.abs

fun main() {
    // write your code here
    val x = readLine()!!.split(" ")
    val y = readLine()!!.split(" ")
    
    val x1 = x[0].toInt()
    val y1 = x[1].toInt()
    val x2 = y[0].toInt()
    val y2 = y[1].toInt()
    
    // println("$x1 $y1\n$x2 $y2")
    
    val beatEachOther = if (
        abs(x2 - x1) == 1 && abs(y2 - y1) == 2 ||
        abs(x2 - x1) == 2 && abs(y2 - y1) == 1
    ) {
        "YES"
    } else {
        "NO"
    }
    println(beatEachOther)
}
