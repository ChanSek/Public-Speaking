package io.chanse.kotlinklass.features

fun main(args: Array<String>) {
    val i = 8
    if (i in 1..10) { // equivalent of 1 <= i && i <= 10
        println(i)
    }

    for (x in 1..4) print(x) // prints "1234"

    for (y in 4..1) print(y) // prints nothing


    for (z in 4 downTo 1) print(z) // prints "4321"


    for (a in 1..4 step 2) print(a) // prints "13"

    for (b in 4 downTo 1 step 2) print(b) // prints "42"



    for (c in 1 until 10) { // c in [1, 10), 10 is excluded
        println(c)
    }
}