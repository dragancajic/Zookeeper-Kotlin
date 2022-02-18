import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    
    val n: Int = scanner.nextInt()
    var i = 1
    while (i * i <= n) {
        println(i * i)
        i++
    }
}
