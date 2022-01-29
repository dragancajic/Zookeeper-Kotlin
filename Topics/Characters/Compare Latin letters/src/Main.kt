fun main() {
    // write your code here
    val latinLetter1 = readLine()!!.first()
    val latinLetter2 = readLine()!!.first()
    
    val areSameLetter = latinLetter1.lowercaseChar() == latinLetter2.lowercaseChar()
    
    println(areSameLetter)
}
