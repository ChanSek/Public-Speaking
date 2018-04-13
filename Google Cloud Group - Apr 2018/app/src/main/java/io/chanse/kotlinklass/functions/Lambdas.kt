package io.chanse.kotlinklass.functions

import java.util.*

// Higher Order Functions


// What is it???


// Example AnonymousClass.kt


fun request(listener: (res: String) -> Unit) {
    // Send request here
    listener("Success")
}


fun main(args: Array<String>) {
    // Calling with Lambda

    request { response ->
        print(response)
        println(response.toUpperCase())
    }


    // Shortened Lambda
    request { print(it) }


    // Method Reference
    request(::printResponse)
}


fun printResponse(res: String) {
    println(res)
}


// Powers of Lambda Expression


fun doSomething() {
    val names = arrayOf(
            "Java",
            "Kotlin",
            "C",
            "C++",
            "Erlang",
            "Python")

    val result = arrayOf<String>()
    for (item in names) {
        if (item.length > 5) {
            result.plus(item.toUpperCase())
        }
    }

    println(Arrays.sort(result))


    // What the above code do???


    // Lets see this


    println(names.filter { it.length > 5 }
            .sortedBy { it }
            .map { it.toUpperCase() })
}



// Next - NullSafety.kt
