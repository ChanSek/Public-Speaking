package io.chanse.kotlinklass.basics



fun forLoop(items: List<String>) {
    // Items
    for(item in items) {
        println("Name - " + item)
    }

    // Fetching through index
    for (i in items.indices) {
        print(items[i])
    }


    for ((index, value) in items.withIndex()) {
        println("the element at " + index + " is " + value)
    }
}





// Next - Classes.kt
// The End