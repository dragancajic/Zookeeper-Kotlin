import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    
    var n: Int = scanner.nextInt()
    while (n != 1) {
        print("$n ")
        if (n % 2 == 0) {
            n /= 2
        } else {
            n = n * 3 + 1
        }
    }
    println(n)
}
