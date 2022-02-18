fun main() {
    // write your code here
    var balance = readLine()!!.toInt()
    val payments = readLine()!!.split(" ")
    var sum = 0
    
    var i = 0
    while (i < payments.size) {
        sum += payments[i].toInt()
        i++
    }
    
    var j = 0
    var tSum = 0
    while (j < payments.size) {
        tSum += payments[j].toInt()
        
        if (tSum > balance) {
            tSum -= payments[j].toInt()
            break
        }
        j++
    }
    
    if (balance >= sum) {
        balance -= sum
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    } else {
        val difference = sum - tSum
        balance -= tSum
        println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $difference.")
    }
}
