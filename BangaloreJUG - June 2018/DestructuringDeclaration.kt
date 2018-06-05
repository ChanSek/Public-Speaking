class DestructuringDeclaration {

    fun createUser() {
        val (name, email, phone) =
                User("Chandra Sekhar Nayak",
                        "chansek@live.com",
                        "8792629767")
        println("Name is - $name")
        println("Email is - $email")
        println("Phone is - $phone")

        val (group, _, contact) = getUser()
        println("Meetup Group name - $group")
        println("Contact number - $contact")
    }

    fun getUser() = User("BangaloreJUG",
            "bangalorejug@gmail.com",
            "0000000000")
}

data class User(var name: String,
                var email: String,
                var phone: String)
