package io.chanse.kotlinklass.interfaces


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






