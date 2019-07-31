package devfest.kolkata.classes

class DelegatedProperties {
    val x by lazy { 10 }
    val y by lazy { 20 }
}

fun main() {
    val delegatedProp = DelegatedProperties()
    println(delegatedProp.x)
    println(delegatedProp.x)
}
