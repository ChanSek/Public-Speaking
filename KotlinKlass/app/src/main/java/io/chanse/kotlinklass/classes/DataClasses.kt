package io.chanse.kotlinklass.classes

data class Patient(val name: String, val age: Int)


data class Doctor(val name: String, val age: Int, val speciality: String)


// Usage below
















fun main(args: Array<String>) {
    val patient = Patient("Subin", 92)


    val doctor = Doctor("Ramya", 51, "Aiyoo Specialist")
}













// What if the parameters of a data class grows

// We will learn this in Default Arguments and Named Arguments section











