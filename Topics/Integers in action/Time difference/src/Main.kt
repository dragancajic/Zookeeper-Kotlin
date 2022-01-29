fun main() {
    // put your code here
    val firstMomentHours = readLine()!!.toInt()
    val firstMomentMinutes = readLine()!!.toInt()
    val firstMomentSeconds = readLine()!!.toInt()

    val secondMomentHours = readLine()!!.toInt()
    val secondMomentMinutes = readLine()!!.toInt()
    val secondMomentSeconds = readLine()!!.toInt()

    val firstMomentInSeconds = firstMomentHours * 3600 + firstMomentMinutes * 60 + firstMomentSeconds
    val secondMomentInSeconds = secondMomentHours * 3600 + secondMomentMinutes * 60 + secondMomentSeconds
    
    print(secondMomentInSeconds - firstMomentInSeconds)
}
