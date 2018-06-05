class Is {

    open inner class Animal

    internal inner class Dog : Animal() {

        fun toDog(): String {
            return "Dog"
        }
    }

    internal inner class Cat : Animal() {

        fun toCat(): String {
            return "Cat"
        }
    }

    fun printAnimal(animal: Animal) {
        if (animal is Dog) {
            println(animal.toDog())
        } else if (animal is Cat) {
            println(animal.toCat())
        }
    }
}