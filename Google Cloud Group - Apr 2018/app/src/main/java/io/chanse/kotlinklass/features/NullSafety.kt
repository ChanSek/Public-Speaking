package io.chanse.kotlinklass.features




// Nullable Operator (? operator)
var text: String? = null


fun main(args: Array<String>) {
    // Safe access operator
    text?.toUpperCase()




    // Not-null asserted operator
    text = "Now it is not null"
    text!!.toUpperCase()
}






fun elvisExample(name: String?) {
    val finalName = name ?: "Not Available"

    // finalName can never be null here
    println(finalName.toUpperCase())
}




// Next - JavaInterop.kt