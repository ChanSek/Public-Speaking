package devfest.kolkata.classes

interface Calculator {
    fun div(a: Int, b: Int) = a / b
}

class DefaultCalculatorImpl : Calculator

class CalculatorImpl : Calculator {
    override fun div(a: Int, b: Int): Int {
        return if (a == 0 || b == 0) 0
        else a / b
    }
}

fun main() {
    val defaultCalculator = DefaultCalculatorImpl()
    println(defaultCalculator.div(10, 2))

    val calculator =  CalculatorImpl()
    println(calculator.div(10, 2))
}