package io.chanse.kotlinklass.basics

import com.example.nayakc2.kotlinklass.model.User


// Primitive Data Types
//   Java                           Kotlin
//=============================================
// 1. int               --          Int
// 2. long              --          Long
// 3. boolean           --          Boolean
// 4. char              --          Char
// 5. double            --          Double
// 6. float             --          Float
// 7. short             --          Short
// 8. byte              --          Byte


// In Java
// int myInt = 10;
// In Kotlin
val myInt: Int = 10



// All types in Kotlin looks like Wrapper types

// Wrapper Data Types
//   Java                           Kotlin
//=============================================
// 1. Integer           --          Int
// 2. Long              --          Long
// 3. Boolean           --          Boolean
// 4. Character         --          Char
// 5. Double            --          Double
// 6. Float             --          Float
// 7. Short             --          Short
// 8. Byte              --          Byte

// In Java
// Integer wrappedInt = 10;
// In Kotlin
val wrappedInt: Int = 10


// In Java
// Integer someInt = null;
// In Kotlin
//val someInt: Int = null


















// Nullable Types




















val nullableInt: Int? = null


// Wrapper Data Types
//   Java                           Kotlin
//=============================================
// 1. Integer           --          Int?
// 2. Long              --          Long?
// 3. Boolean           --          Boolean?
// 4. Character         --          Char?
// 5. Double            --          Double?
// 6. Float             --          Float?
// 7. Short             --          Short?
// 8. Byte              --          Byte?


// Take Away
// 1. Int != Int?
// 2. Int (kotlin) = int (Java)
// 3. Int? (kotlin) = Integer (Java)





val abc: Int? = 10







// Class Type








val str: String = "Hello Kotlin"
val user: User = User()
val list: Array<String> = arrayOf(str)











// Super most Type
// In Java - Object
// In Kotlin - ???










// In Java
// String s = "Java";
// Object obj = " Java";

// In Kotlin
val s: String = "Kotlin"
val any: Any = "Any Kotlin"
val anyInt: Any = 10








// Sub-most Type

// In Java
// Integer x = null;
// String y = null;
// Object obj = null;
// ArrayList<String> list = null



// null is the the sub most type in Java
// What is in Kotlin???

// In Kotlin
// val submostString: String = null
// val submostObj: Any = null




// Not possible bcz of nullable Type
val validSubmostString: String? = null

// Nullable type - we have null
// What about types which are non-nullable???








// Nothing Type






val submostStr: String = throw NullPointerException("Some Shit Happened")












// val vs var

// 1. val - read only
// 2. var - can be edited


// In Java
// final String x = "Java";

// In Kotlin
val readOnlyStr: String = "Read Only Kotlin"
var editableStr: String = "Editable Kotlin"

fun test() {
//    readOnlyStr = "Forcing to Edit"
    editableStr = "Easily can be edited"
}









// Type Inference



val notInferred: Int = 10
val inferred = 10
val xuz = User()


val notInferredString: String = "Not Inferred String"
val inferredString = "Inferred String"



val nonInferredUser: User = User()
val inferredUser = User()









// void (Java) == Unit (Kotlin)










// Next - HelloWorld.kt
// The End