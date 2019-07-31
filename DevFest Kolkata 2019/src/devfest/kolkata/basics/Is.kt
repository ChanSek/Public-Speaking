package devfest.kolkata.basics

open class A

class B : A()

class C : A()

fun test(a: A) {
    when (a) {
        is B -> println("Hi")
        is C -> println("Hello")
    }
}