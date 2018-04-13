package io.chanse.kotlinklass.basics

// When is an advance switch


fun main(args: Array<String>) {
    val x = args[0]
    when (x) {
        "Java" -> {
            print("Java is Good")
        }
        "Kotlin" -> print("Kotlin is Better")
        else -> print("Not Good")
    }
}


fun when2(args: Array<String>) {
    val x = args[0].toInt()
    when (x) {
        1, 2 -> print("Either 1 or 2")
        3, 4 -> print("Either 3 or 4")
        else -> print("More than 5")
    }
}


fun when3(args: Array<String>) {
    val x = args[0].toInt()
    when (x) {
        in 1..10 -> print("In proper Range")
        !in 10..20 -> print("Outside Range")
        else -> print("None of the above...")
    }
}


fun when4(any: Any) {
    when (any) {
        is String -> print("Input is a String")
        is Int -> print("Input is an Integer")
        else -> print("Illegal Argument")
    }
}


fun toString(num: Int): String {
    return when (num) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Otherwise"
    }
}




fun toString2(num: Int) = when (num) {
    1 -> "One"
    2 -> "Two"
    3 -> "Three"
    else -> "Otherwise"
}




// When as if-else chain
fun ifElseChain(num: Int) = when {
    num < 0 -> "Negative Number"
    num > 0 -> "Positive Number"
    else -> "Zero"
}





// Next - ForLoop.kt
// The End