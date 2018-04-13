package io.chanse.kotlinklass.classes

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import io.chanse.kotlinklass.R


// 1. Compile time error - Should be initialized
// 2. Make it nullable
// 3. Every time null check is mandatory
// 4. Use late initialization

class LateInit: Activity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.late_init)

        textView = findViewById(R.id.hello_kotlin)
        initUi()
    }

    private fun initUi() {
        textView.text = "Hello Kotlin"
    }




    // Next example Lazy.kt
}
