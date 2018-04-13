package io.chanse.kotlinklass.functions

import java.util.*

// Higher Order Functions


// What is it???


// Example AnonymousClass.kt


















inline fun request(noinline listener: (res: String) -> Unit) {
    // Send request here
    listener("Success")
}












fun main(args: Array<String>) {
    // Calling with Lambda

    request { response ->
        run {
            print(response)
            println(response.toUpperCase())
        }
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
            "Subin",
            "Chandra",
            "Sachin",
            "Ramya",
            "Utkarsh",
            "Sid")

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






// Inline Functions




// Show example in request() of same file











// noinline keyword

// If function accepts multiple lambdas






// Next - NullSafety.kt
