package io.chanse.kotlinklass.interfaces

import com.example.nayakc2.kotlinklass.basics.PrivateTest

interface Listener {
    fun onSuccess(response: Any)
    fun onFailure(exception: Exception)
}




class Test : Listener {

    override fun onSuccess(response: Any) {
        println("Success")
    }

    override fun onFailure(exception: Exception) {
        exception.printStackTrace()
    }
}









// Default Implementation













interface DefaultListener {
    fun onSuccess(response: Any)
    fun onFailure(exception: Exception) {
        // Default implementation
        exception.printStackTrace()
    }
}









class DefaultTest : DefaultListener {

    override fun onSuccess(response: Any) {
        println("Success")
    }
}









// Conflict resolution










interface ImplementedListener {
    fun onSuccess(response: Any) {
        println("Success")
    }

    fun onFailure(exception: Exception) {
        // Default implementation
        exception.printStackTrace()
    }
}





open class Tests

class ConflictClass : DefaultListener, ImplementedListener, Tests() {
    override fun onSuccess(response: Any) {
    }

    override fun onFailure(exception: Exception) {
    }
    // Check the error and implement the methods
}



fun main(args: Array<String>) {
    val text = PrivateTest()
    text.returnTest()
}

