package io.chanse.kotlinklass.features

class KUserAccess {

    fun access() {
        val jPatient = JavaPatient()
        jPatient.name = "Some Name"
        jPatient.phone = "8972463222"


        val kPatient = KotlinPatient()
        kPatient.name = "kotlin patient"

        // cannot be reassigned
//        kPatient.phone = "73834563454"
    }
}
