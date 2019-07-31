package devfest.kolkata.functions

var event = ""

fun outer() {
    fun inner() {
        println("inner function")
    }
    println("outer function")
    if (event == "DevFest Kolkata") inner()
}

fun main() {
    outer()

    event = "DevFest Kolkata"
    outer()
}