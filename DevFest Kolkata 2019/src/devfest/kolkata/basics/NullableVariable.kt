package devfest.kolkata.basics

import devfest.kolkata.model.Conference

val readableConf = Conference("DevFest Kolkata", 2)
var readWriteConf = Conference("Firebase Roadshow", 1)
lateinit var lazyConf: Conference

var nullableConf: Conference? = null

fun main() {
    println("Name: ${readableConf.name} Tracks: ${readableConf.tracks}")
    println("Name: ${readWriteConf.name} Tracks: ${readWriteConf.tracks}")
    println("Name: ${lazyConf.name} Tracks: ${lazyConf.tracks}")

    val len = nullableConf?.name?.toUpperCase()?.capitalize()?.substring(2..5)?.length
    println("Length - $len")
}
