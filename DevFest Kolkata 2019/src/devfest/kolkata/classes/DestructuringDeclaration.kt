package devfest.kolkata.classes

import devfest.kolkata.model.User

typealias U = User

fun main() {
    val user = U("Chandra", 10)
    val person = Person("Sekhar", 20)

    val (name, age) = person
}

private class Person(val name: String, val age: Int) {

    operator fun component1() = name

    operator fun component2() = age
}