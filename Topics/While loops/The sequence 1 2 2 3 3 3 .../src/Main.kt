fun main() {
    // put your code here
    val n = readLine()!!.toInt()
    var counter = 0 // number of current element in sequence
    
    var i = 1
    while (i <= n) {
        var j = 1
        while (j <= i && counter < n) {
            print("$i ")
            j++
            counter++
        }
        i++
    }
}
