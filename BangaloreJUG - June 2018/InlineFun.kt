var value = 0

inline fun assignAndOperate(a: Int, func: () -> Unit) {
    value = a
    func()
}

fun main(args: Array<String>) {
    assignAndOperate(2) {
        value *= 5
    }
    println(value)

    assignAndOperate(2) {
        value *= 10
    }
    println(value)
}
