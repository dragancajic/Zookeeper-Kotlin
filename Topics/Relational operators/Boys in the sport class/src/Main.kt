// import java.util.*

fun main() {
    // put your code here
    // val scanner = Scanner(System.`in`)
    // println("Enter three numbers: ");
    val h1 = readLine()!!.toInt()
    val h2 = readLine()!!.toInt()
    val h3 = readLine()!!.toInt()
    
    val areArrangedCorrectly = h1 <= h2 && h2 <= h3 || h1 >= h2 && h2 >= h3
    // or converted to range check(s)
    // val areArrangedCorrectly = h2 in h1..h3 || h2 in h3..h1
    
    println(areArrangedCorrectly)
    
    // 'String' concatenation can be converted to a template
    // println("" + h1 + " " + h2 + " " + h3);
    // println("$h1 $h2 $h3");
    
}
