package devfest.kolkata.basics

val x = 2
fun when1() {
    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> print("x is neither 1 nor 2")
    }
}

fun when2() {
    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }
}

fun when3() {
    when {
        x == 1 -> print("x == 1")
        x == 2 -> print("x == 2")
        else -> print("x is neither 1 nor 2")
    }
}

enum class Day {
    MON, TUES, WED, THU, FRI, SAT, SUN
}

fun when4(day: Day) {
    when (day) {
        Day.MON -> println(day)
        Day.TUES -> println(day)
        Day.WED -> println(day)
        Day.THU -> println(day)
        Day.FRI -> println(day)
        Day.SAT -> println(day)
        Day.SUN -> println(day)
    }
}

fun when5(day: Day) {
    when (day) {
        Day.MON -> println(day)
        Day.TUES -> println(day)
        Day.WED -> println(day)
        Day.THU -> println(day)
        Day.FRI -> println(day)
        Day.SAT -> println(day)
        Day.SUN -> println(day)
    }
}

fun when6(day: Day) {
    when (day) {
        Day.MON -> println(day)
        Day.TUES -> println(day)
        Day.WED -> println(day)
        Day.THU -> println(day)
        Day.FRI -> println(day)
        Day.SAT -> println(day)
        Day.SUN -> println(day)
    }
}

fun when7(day: Day) {
    when (day) {
        Day.MON -> println(day)
        Day.TUES -> println(day)
        Day.WED -> println(day)
        Day.THU -> println(day)
        Day.FRI -> println(day)
        Day.SAT -> println(day)
        Day.SUN -> println(day)
    }
}

fun main() {
    when4(Day.FRI)
}