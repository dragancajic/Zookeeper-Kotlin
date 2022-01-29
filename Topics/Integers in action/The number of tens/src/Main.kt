fun main() {
    // put your code here
    var nonNegativeInteger = readLine()!!.toInt() // 173
    val numberOfTens: Int
    
    if (nonNegativeInteger / 10 == 0) {
        numberOfTens = 0
    } else {
        // 173 % 100 = 73
        nonNegativeInteger %= 100
    
        //  73 / 10  =  7
        numberOfTens = nonNegativeInteger / 10
    }
    
    println(numberOfTens)
}
