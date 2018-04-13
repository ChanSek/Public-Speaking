package io.chanse.kotlinklass.functions

fun test() {
    println("Test Function")
}


class Test {

    fun test() {
        println("Test Method")
    }
}


fun test1(x: Int) {

}


fun test2(x: Int, y: Long) : Unit{
    return Unit
}


fun test3(x: Int, y: Int): Int {
    return x + y
}










// Default Arguments














fun add(a: Int = 0, b: Int = 0, c: Int = 0, d: Int = 0, e: Int = 0): Int {
    return a + b + c + d + e


    // Show the example in main function
}

// No need to overload any method
















// Named Arguments














fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {

    // Do your formatting code here


    // Show the example in main function

}










// Unit returning functions


// Examples in test(), test1() or test2()












// Single Expression function


fun double(x: Int) = x * 2


// Example in add()














// Infix Notation


class ToDo {

    private var tasks = listOf<String>()

    infix fun add(task: String) {
        tasks.plus(task)
    }

    fun main(args: Array<String>) {
        this add "Design"
        this add "Code"
        this add "Release"
    }


    // Map example


    fun mapIt() {
        val map = mapOf(
                "A" to "Apple",
                "B" to "Ball",
                "C" to "Cat"
        )

        map.plus("D" to "Dog")
    }
}




fun main(args: Array<String>) {
    test()
    test1(10)
    test2(10, 20L)
    test3(10, 20)


    reformat("test test")
    reformat(upperCaseFirstLetter = false,
            str = "Some Value")
}




// Next - Lambdas.kt





