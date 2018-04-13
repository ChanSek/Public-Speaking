package io.chanse.kotlinklass.functions

import android.app.Activity
import android.os.Bundle
import io.chanse.kotlinklass.R
import kotlinx.android.synthetic.main.late_init.*

class ExtensionsActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.late_init)

        initUi()
    }

    private fun initUi() {
        hello_kotlin.visible()
    }


    private fun updateUi() {
        val finalText = 10.double()
        hello_kotlin.text = finalText.toString()
    }


    private fun insertToDb() {
        val values = contentValuesOf(
                "name" to "Chandra",
                "Email" to "chandra@chanse.io",
                "Role" to "Android Engineer")


        // Now we know what to do with this content values
    }

}
