package io.chanse.kotlinklass.basics








// If Expression




// What is an expression???










// If is an expression in Kotlin








// Example






// Traditional Usage

fun main(args: Array<String>) {
    val a = args[0].toInt()
    val b = args[1].toInt()
    val max = if(a < b) b else a
    println("Bigger - " + max)
}










// With else block

fun main2(args: Array<String>) {
    val a = args[0].toInt()
    val b = args[1].toInt()
    val max: Int
    if (a < b) max = b
    else max = a
    println("Bigger - " + max)
}












// If expression

fun main3(args: Array<String>) {
    val a = args[0].toInt()
    val b = args[1].toInt()
    val max = if (a > b) a else b
    println("Bigger - " + max)
}





fun main4(args: Array<String>) {
    val a = args[0].toInt()
    val b = args[1].toInt()
    val max = if (a > b) {
        println("Max is - " + a)
        a
    } else {
        println("Max is - " + b)
        b
    }
    println("Bigger - " + max)

    com.example.nayakc2.kotlinklass.functions.test()
}




// Next - WhenExpr.kt
// The End