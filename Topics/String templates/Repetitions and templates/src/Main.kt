fun main() {
    // write your code here
    val word = readLine()!!
    
    val lengthOfWord = word.length
    
    println("$lengthOfWord repetitions of the word $word: ${word.repeat(lengthOfWord)}")
}
