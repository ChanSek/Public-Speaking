package devfest.kolkata.functions

val test: () -> Unit = fun () {
    println("This is same as a class implementing Function0<Unit>")
}

val test2: (Int, Int) -> Int = fun (x: Int, y: Int): Int {
    return x + y
}

val sum: Int.(Int) -> Int = { this + it }

val sum2: (Int, Int) -> Int = { x, y -> x + y }

fun main() {
    println(sum2(2, 3))
    println(2.sum(3))
}