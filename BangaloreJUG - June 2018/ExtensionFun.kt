fun ArrayList<String>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main(args: Array<String>) {
    val list = arrayListOf("BangaloreJUG", "BlrKotlin", "BlrDroid")
    list.swap(0, 1)
    print(list)
}