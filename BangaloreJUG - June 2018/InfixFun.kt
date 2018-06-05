infix fun <A, B> A.to(that: B) = Pair(this, that)

fun main(args: Array<String>) {
    val languages = mapOf(1 to "Java", 2 to "Kotlin", 3 to "Scala")

    val couples = getCouples()
    print(couples)
    val oldCouples = getOldCouples()
    print(oldCouples)
}

class Couple(private val first: String, private val second: String) {
    override fun toString(): String {
        return "$first loves $second"
    }
}

infix fun String.loves(that: String) = Couple(this, that)

fun getCouples() = arrayListOf(
        "Ram" loves "Java",
        "Sita" loves "Kotlin"
)

fun getOldCouples() = arrayListOf(
        Couple("Ram", "Java"),
        Couple("Sita", "Kotlin")
)
