fun main() {
    // put your code here
    var number: Int
    var max = 0
    
    do {
        number = readLine()!!.toInt()
        
        if (number > max) {
            max = number
        }
    } while (number != 0)
    
    println(max)
}
