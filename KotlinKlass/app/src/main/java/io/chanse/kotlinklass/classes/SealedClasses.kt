package io.chanse.kotlinklass.classes

sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
class NotANumber : Expr()




fun eval(expr: Expr): Double {
    return when (expr) {
        is Const -> expr.number
        is Sum -> eval(expr.e1) + eval(expr.e2)
        is NotANumber -> Double.NaN
// the `else` clause is not required because we've covered all the cases
    }
}
