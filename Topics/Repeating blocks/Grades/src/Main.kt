fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    
    var gradeA = 0
    var gradeB = 0
    var gradeC = 0
    var gradeD = 0
    
    repeat(n) {
        val grade = readLine()!!.toInt()
        if (grade == 5) {
            gradeA++
        }
        if (grade == 4) {
            gradeB++
        }
        if (grade == 3) {
            gradeC++
        }
        if (grade == 2) {
            gradeD++
        }
    }
    println("$gradeD $gradeC $gradeB $gradeA")
}
