package devfest.kolkata.classes

inline class UserId(val id: Long)

fun main() {
    val userId = UserId(10L)
    getUser(userId)
}

private fun getUser(id: UserId) {

}