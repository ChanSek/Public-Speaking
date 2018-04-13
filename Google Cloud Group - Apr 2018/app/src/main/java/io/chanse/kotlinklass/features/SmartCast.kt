package io.chanse.kotlinklass.features

import android.app.Activity
import android.app.Fragment
import android.content.Context

class TestActivity : Activity() {

    fun test() {
        print("test")
    }
}


class OtherActivity : Activity() {

    fun other() {
        print("other")
    }
}


class SomeFragment : Fragment() {

    private val parent: Activity by lazy { activity }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        updateUi(parent)
    }

    private fun updateUi(parent: Activity) {
        if (parent is TestActivity) {
            parent.test()
        } else if (parent is OtherActivity) {
            parent.other()
        } else {
            throw IllegalStateException("Should not have happened")
        }
    }
}
