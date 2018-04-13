package io.chanse.kotlinklass.classes


// Nested Class



class Outer {

    private val bar: Int = 1

    class Nested {
        fun foo() {
            print("Foo")
        }
    }
}


val demo = Outer.Nested().foo()









// Inner Class














class Out {
    private val bar: Int = 1
    inner class In {
        fun foo() = bar
    }
}

val foo = Out().In().foo()














// Anonymous Inner Class




// Ex. AnonymousClass.kt






