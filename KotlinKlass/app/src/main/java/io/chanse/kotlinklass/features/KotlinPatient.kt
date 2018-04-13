package io.chanse.kotlinklass.features

data class KotlinPatient(var name: String = "",
                         var problem: String = "",
                         val phone: String = "") {

























    override fun toString(): String {
        return "Name - $name, Problem - $problem, Phone - $phone"
    }



    // Show in Single line method expression


    // Next - Extensions.kt
}