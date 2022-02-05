fun main() {
    // write your code here
    val x1y1z1 = readLine()!!.split(" ")
    
    val x1 = x1y1z1[0].toInt()
    val y1 = x1y1z1[1].toInt()
    val z1 = x1y1z1[2].toInt()
    
    val x2y2z2 = readLine()!!.split(" ")
    val x2 = x2y2z2[0].toInt()
    val y2 = x2y2z2[1].toInt()
    val z2 = x2y2z2[2].toInt()
    
    // println("$x1 $y1 $z1")
    // println("$x2 $y2 $z2")
    
    // TODO Try to find solution without using arrays! / simpler solution
    val box1 = intArrayOf(x1, y1, z1)
    val box2 = intArrayOf(x2, y2, z2)
    
    box1.sort()
    box2.sort()
    
    var countSize0 = 0
    var countSize1 = 0
    var countSize2 = 0
    
    for (i in 0..2) {
        for (j in 0..2) {
            if (box2[j] == box1[i] && i == j) {
                countSize0++
            }
            
            if (box2[j] <= box1[i] && i == j) {
                countSize1++
            }
            
            if (box2[j] >= box1[i] && i == j) {
                countSize2++
            }
        }
    }
    
    if (countSize0 == 3) {
        println("Box 1 = Box 2")
    } else if (countSize1 == 3) {
        println("Box 1 > Box 2")
    } else if (countSize2 == 3) {
        println("Box 1 < Box 2")
    } else {
        println("Incomparable")
    }
}
