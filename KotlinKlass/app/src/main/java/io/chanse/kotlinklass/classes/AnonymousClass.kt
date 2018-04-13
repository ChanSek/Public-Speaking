package io.chanse.kotlinklass.classes

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.nayakc2.kotlinklass.R

class AnonymousClass: Activity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.late_init)

        textView = findViewById(R.id.hello_kotlin)
        textView.setOnClickListener {
            v -> v.visibility = View.VISIBLE
        }
        initUi()
    }

    private fun initUi() {
        textView.text = "Hello Kotlin"
    }
}



// Next Example - Objects.kt