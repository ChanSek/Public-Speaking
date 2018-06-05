class KtEncapsulation {

    private inner class Animal { }

    private var animal = Animal()

    fun getAnimal() = animal

    fun setAnimal(newAnimal: Animal) {
        animal = newAnimal
    }
}
