package io.chanse.kotlinklass.classes

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.example.nayakc2.kotlinklass.R

class Lazy: Activity() {

    // val is more preferable here as it should not be changed
    private val helloKt: TextView by lazy {
        findViewById<TextView>(R.id.hello_kotlin)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.late_init)

//        helloKt =
//        helloKt = findViewById(R.id.awesome_kotlin)
        initUi()
    }

    private fun initUi() {
        helloKt.text = "Hello Kotlin"
    }
}
