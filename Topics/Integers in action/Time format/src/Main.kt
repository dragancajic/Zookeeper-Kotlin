fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // don't change this line
    // enter your code
    
    // test
    // val totalSeconds = 7300
    
    // 7300 / 3600 = 2 (2 * 3600 + 100)
    val totalHours = totalSeconds / 3600
    // val days = totalHours / 24 // <-- don't need this, days, just hours of actual day!!
    val hours = totalHours % 24 // <-- cut off days, to find out actual today's time hours
    
    // 7300 % 3600 = 100
    val remainder = totalSeconds % 3600
    
    // 100 / 60 = 1 (1 * 60 + 40)
    val minutes = remainder / 60
    
    // 100 % 60 = 40
    val seconds = remainder % 60
    
    // 2:1:40
    println("$hours:$minutes:$seconds")
}
