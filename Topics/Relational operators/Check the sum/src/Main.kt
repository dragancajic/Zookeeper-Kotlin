fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    
    val isSum20 = a + b == 20 || a + c == 20 || b + c == 20
    
    println(isSum20)
}
