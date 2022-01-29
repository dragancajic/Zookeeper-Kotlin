fun main() {
    // put your code here
    val naturalNumber = readLine()!!.toInt()
    val nextEvenNumber: Int
    
    if (naturalNumber % 2 == 0) {
        nextEvenNumber = naturalNumber + 2
    } else {
        nextEvenNumber = naturalNumber + 1
    }
    
    println(nextEvenNumber)
}
