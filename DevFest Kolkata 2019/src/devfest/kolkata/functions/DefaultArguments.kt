package devfest.kolkata.functions

fun add(a: Int,
        b : Int,
        c: Int = 100,
        d: Int = 200,
        e: Int = 300) =
    a + b + c + d + e

fun concat(a: String, b: String, c: String = "Test", d: String = "Test 2") = a + b + c + d

fun main() {
    add(2, 3, 4, 5, 6)
    add(2, 3)
    add(2, 3, 4, 5)

    concat("Chandra", "Sekhar", "Nayak")
}