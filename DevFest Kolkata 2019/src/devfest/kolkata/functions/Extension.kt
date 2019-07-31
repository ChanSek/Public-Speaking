package devfest.kolkata.functions

fun IntArray.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)
    arr.swap(2, 4)
}