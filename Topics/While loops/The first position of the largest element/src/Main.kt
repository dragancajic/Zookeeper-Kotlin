import java.util.Scanner

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    
    var number = scanner.nextInt()
    var max: Int = number
    var tPosition = 1
    var maxPosition = 1
    
    while (scanner.hasNextInt()) {
        number = scanner.nextInt()
        tPosition++
        
        if (number > max) {
            max = number
            maxPosition = tPosition
        }
    }
    println("$max $maxPosition")
}
