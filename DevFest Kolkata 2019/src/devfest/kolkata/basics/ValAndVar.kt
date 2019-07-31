package devfest.kolkata.basics

import devfest.kolkata.model.User

val num = 10
val user = User("Chandra Sekhar", 30)

var num2 = 20
var user2 = User("Rivu", 28)

lateinit var user3: User

fun main() {
    println(num.toString())
    println(user.age)

    println(num2.toString())
    println(user2.age)

    user3 = User("Adit", 30)
    if (::user3.isInitialized) {
        println("User3 is initialized")
    }
    println(user3.age)

    val obj1 = ValAndVarKt1()
    println(obj1.user10)
    println(obj1.user11)
    println(obj1.user12)
}

class ValAndVarKt1 {

    val user10 = User("Chandra Sekhar", 30)
    var user11 = User("Chandra Sekhar", 30)
    lateinit var user12: User

    fun test() {
        user12 = User("Chandra Sekhar", 30)
    }
}
