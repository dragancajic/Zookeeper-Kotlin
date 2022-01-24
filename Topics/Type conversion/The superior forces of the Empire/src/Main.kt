fun main() {
    // write your code here
    val stringEmpireShips = readLine()!!
    val stringRebelShips = readLine()!!

    val intEmpireShips = stringEmpireShips.toInt()
    val intRebelShips = stringRebelShips.toInt()

    println(intEmpireShips / intRebelShips)
}