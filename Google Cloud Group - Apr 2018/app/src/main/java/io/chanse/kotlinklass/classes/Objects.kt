package io.chanse.kotlinklass.classes

// Object Expressions
// Object Declaration



// We saw it just now in AnonymousClass.kt



// Object Declaration


object SingleClass {

    fun single1() {

    }

    fun single2() {

    }
}
















// You just now created a singleton with a single line of code
// let's use it










class UseSingleClass {

    fun main(args: Array<String>) {
        val clazz = SingleClass
        clazz.single1()
        clazz.single2()
    }
}





// Next - Functions.kt