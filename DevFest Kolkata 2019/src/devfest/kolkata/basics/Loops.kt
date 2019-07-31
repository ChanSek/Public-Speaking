package devfest.kolkata.basics

fun for1() {
    for (i in 0..10) {
        println(i)
    }

    for (i in 100 downTo 0 step 2) {
        println(i)
    }

    val ints = intArrayOf(1, 4, 8, 12)
    for(i in ints) {
        println(i)
    }
}