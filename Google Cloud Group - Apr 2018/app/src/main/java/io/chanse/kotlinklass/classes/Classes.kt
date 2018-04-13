package io.chanse.kotlinklass.classes

import android.content.Context
import android.util.AttributeSet
import android.view.View

class User {

}

class Customer


// Constructors


// 1. Primary Constructor
// 2, Secondary Constructor


// Primary Constructors
class Person constructor(name: String, email: String) {

    fun access() {
        // Not possible to access name and email
//        name = "Test"
    }
}


class AwesomeUser constructor(val name: String, val email: String) {

    fun access() {
        println("Name Length - " + name.length)
        println("Email Length - " + email.length)
    }
}


// Secondary Constructor





class SampleView : View {


    constructor(context: Context) : this(context, null) {

    }

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0) {

    }

    constructor(context: Context, attrs: AttributeSet?, style: Int) : super(context, attrs, style) {

    }
}








class MyView @JvmOverloads constructor(context: Context,
                                       attrs: AttributeSet? = null,
                                       style: Int = 0)
    : View(context, attrs, style) {

}










// Private Constructors




class DontCreateMe private constructor () {
}









// Creating objects

val user = User()
//val view = SampleView()









// Inheritance





class Example // Implicitly inherits from Any














class Super




class Sub : Super()












// We have to explicitly say that we are planning to extend this class in future
// and it is designed for that





open class Parent




class Child : Parent()









class CustomView : View {
    constructor(ctx: Context) : super(ctx)

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}











// Overriding methods







open class Base {
    open fun v() {}
    fun nv() {}
}




class Derived() : Base() {
    override fun v() {}
}










// Overriding properties






open class Foo {
    open var x = 10
}



class Bar : Foo() {
    override var x: Int = 10
}









