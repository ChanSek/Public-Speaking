package devfest.kolkata.classes

sealed class Calculation
class Add(val num1: Int, val num2: Int) : Calculation()
class Sub(val num1: Int, val num2: Int) : Calculation()
class Mul(val num1: Int, val num2: Int) : Calculation()
class Div(val num1: Int, val num2: Int) : Calculation()

fun main() {
    calculate(Add(2, 3))
    calculate(Sub(10, 5))
    calculate(Mul(10, 2))
    calculate(Div(10, 2))
}

private fun calculate(calculator: Calculation) {
    when(calculator) {
        is Add -> calculator.num1 + calculator.num2
        is Sub -> calculator.num1 - calculator.num2
        is Mul -> calculator.num1 * calculator.num2
        is Div -> calculator.num1 / calculator.num2
    }
}