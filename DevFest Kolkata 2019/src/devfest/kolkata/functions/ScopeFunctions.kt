package devfest.kolkata.functions

fun main() {
    val numbers: MutableList<String> = mutableListOf("one", "two", "three", "four", "five")
    numbers.let {
        it.add("six")
    }

    numbers.apply {
        add("seven")
    }

    with(numbers) {
        add("eight")
    }

    numbers.run {
        add("nine")
    }

    numbers.let(::println)
}