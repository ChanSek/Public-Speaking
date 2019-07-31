package devfest.kolkata.functions

infix fun Int.into(times: Int) = this * times

fun main() {
    println(2 into 10)
}