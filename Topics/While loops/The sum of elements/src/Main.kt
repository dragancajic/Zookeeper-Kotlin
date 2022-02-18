fun main() {
    // put your code here
    var sum = 0
    
    while (true) {
        val number = readLine()!!.toInt()
        
        if (number == 0) {
            break
        } else {
            sum += number
        }
    }
    println(sum)
}