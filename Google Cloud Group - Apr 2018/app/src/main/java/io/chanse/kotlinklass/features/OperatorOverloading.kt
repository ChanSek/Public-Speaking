package io.chanse.kotlinklass.features


// +a -- a.unaryPlus()
// -a -- a.unaryMinus()
// !a -- a.not()




data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)


fun main(args: Array<String>) {
    val point = Point(10, 20)
    println(-point)  // prints "(-10, -20)"
}








// Binary Operator

// a + b -- a.plus(b)
// a - b -- a.minus(b)








// in operator

// a in b -- b.contains(a)
// a !in b -- !b.contains(a)







// Index Access operator

// a[i]	-- a.get(i)
// a[i, j] -- a.get(i, j)
// a[i] = b -- a.set(i, b)