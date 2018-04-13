package io.chanse.kotlinklass.functions

import android.content.ContentValues
import android.database.Cursor
import android.view.View

fun View.visible() {
    visibility = View.VISIBLE
}


fun View.gone() {
    visibility = View.GONE
}


// Usage example is in ExtensionsActivity.kt


















fun Int.double(): Int {
    return this * 2
}



// Usage example is in ExtensionsActivity.kt  --  updateUi() method


















// Some Android Example









fun contentValuesOf(vararg pairs: Pair<String, Any?>) : ContentValues {
    return ContentValues(pairs.size).apply {
        for ((key, value) in pairs) {
            when (value) {
                null -> putNull(key)
                is String -> put(key, value)
                is Int -> put(key, value)
                is Long -> put(key, value)
                is Boolean -> put(key, value)
                is Float -> put(key, value)
                is Double -> put(key, value)
                is ByteArray -> put(key, value)
                is Byte -> put(key, value)
                is Short -> put(key, value)
                else -> {
                    val valueType = value.javaClass.canonicalName
                    throw IllegalArgumentException("Illegal value type $valueType for key \"$key\"")
                }
            }
        }
    }
}




// Usage example is in ExtensionsActivity.kt  --  updateToDb() method




fun Cursor.getStringOrNull(columnName: String) =
        getColumnIndexOrThrow(columnName).let { if (isNull(it)) null else getString(it) }
