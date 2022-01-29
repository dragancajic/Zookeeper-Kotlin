fun main() {
    // write your code here
    val character = readLine()!!.first()
    
    val isCapitalOrDigit = character.isLetter() &&
        character.isUpperCase() || character.isDigit() && character != '0'
    
    println(isCapitalOrDigit)
}
