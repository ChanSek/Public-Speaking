package devfest.kolkata.basics

class IfElse {

    val a = 10
    val b = 20

    fun ifElse() {
        var max = a
        if (a < b) max = b
        println(max)
    }

    fun ifElese1() {
        var max: Int
        if (a > b) {
            max = a
        } else {
            max = b
        }
        println(max)
    }

    fun ifElse3() {
        val max = if (a > b) a else b
        println(max)
    }

    fun ifElse4() {
        val max = if (a > b) {
            print("Choose a")
            a
        } else {
            print("Choose b")
            b
        }
        println(max)
    }
}
