package io.chanse.kotlinklass.features

fun main(args: Array<String>) {

    // You can definitely return multiple values from a function
    val (name, _, email) = ParcelledPatient("Subin", "1234AB")

    print("Patient Name is - ${name.toUpperCase()}")
    print("Patient Id is - $email")
}
