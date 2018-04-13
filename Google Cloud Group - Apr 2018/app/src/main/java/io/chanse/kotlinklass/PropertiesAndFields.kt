package io.chanse.kotlinklass

/**
 * Created by chansek on 27/02/18.
 */
class PropertiesAndFields {




    // Declaring a Property


    private fun add(x: Int, y: Int) = x + y





















    class Address {
        var name: String = ""
        var street: String = ""
        var city: String = ""
        var state: String? = null
        var zip: String = ""
    }









    fun copyAddress(address: Address) : Address {
        val result = Address()
        result.name = address.name
        result.city = address.city
        return  result
    }













    // Getters and Setters
















    val list = intArrayOf(1, 2, 3, 4, 5)
    val isInLimit: Boolean
        get() = list.size <= 5













    // Err - val can't have setter

    val anotherList = intArrayOf(10, 20, 30, 40, 50)
        set(value) {
            anotherList = value
        }










    // Don't do this....
    var recList = intArrayOf(10, 20, 30, 40, 50)
        set(value) {
            recList = value
        }

    // it's a recursion call

















    var positiveList = intArrayOf()
        set(value) {
            val result = intArrayOf(value.size)
            for (i in value.indices) {
                result[i] = if (value[i] < 0) value[i] * -1 else value[i]
            }
            field = result
        }
}
