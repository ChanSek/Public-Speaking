package io.chanse.kotlinklass.features;

import com.example.nayakc2.kotlinklass.features.KotlinPatient;

public class JUserAccess {

    private void access() {
        JavaPatient jPatient = new JavaPatient();
        jPatient.setName("Subin");
        jPatient.setProblem("Unable to ...");

        KotlinPatient kPatient = new KotlinPatient();
        kPatient.setName("Chandra");
        kPatient.setProblem("Able to ???");
        // No setter for phone
    }
}
