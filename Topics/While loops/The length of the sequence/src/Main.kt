fun main() {
    // put your code here
    // do-while loop solution
    /*
        int count = -1;
        int number;
        do {
            number = scanner.nextInt();
            count++;
        } while (number != 0);
        */
    // while loop solution
    var count = 0
    while (true) {
        val number = readLine()!!.toInt()
        if (number == 0) {
            break
        }
        count++
    }
    println(count)
}
