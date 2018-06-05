class DefaultParams {

    fun add(a: Int, b: Int, c: Int = 0) = a + b + c

    fun testAdd() {
        add(10, 20)
        add(10, 20, 30)
    }
}