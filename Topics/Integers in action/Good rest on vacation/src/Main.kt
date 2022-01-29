fun main() {
    // put your code here
    val durationInDays = readLine()!!.toInt()
    val totalFoodCostPerDay = readLine()!!.toInt()
    val oneWayFlightCost = readLine()!!.toInt()
    val costOfOneNightInAHotel = readLine()!!.toInt()
    
    val total = durationInDays * totalFoodCostPerDay +
        2 * oneWayFlightCost + costOfOneNightInAHotel * (durationInDays - 1)
    
    println(total)
}
