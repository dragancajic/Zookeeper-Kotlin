fun main() {
    val invitation = readLine().toBoolean() // read other value in the same way
    // write your code here
    val broughtGift = readLine().toBoolean()

    println(invitation && broughtGift)
}