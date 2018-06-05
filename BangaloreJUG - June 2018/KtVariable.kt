class KtVariable {

    private var tag = "KtVariable"

    fun printTag() {
        println(tag)
    }

    fun tagParam(someTag: String) {
        print(someTag)
        print(tag)
    }
}
