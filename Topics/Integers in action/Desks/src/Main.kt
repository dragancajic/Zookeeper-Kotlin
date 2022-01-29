fun main() {
    // put your code here
    
    val students1 = readLine()!!.toInt()
    val students2 = readLine()!!.toInt()
    val students3 = readLine()!!.toInt()
    
    val desks1 = students1 / 2 + students1 % 2 // 20 / 2 = 10
    val desks2 = students2 / 2 + students2 % 2 // 21 / 2 = 10 (+ 1 = 11)
    val desks3 = students3 / 2 + students3 % 2 // 22 / 2 = 11
    
    println(desks1 + desks2 + desks3) // 32
}
