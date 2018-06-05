public class InstanceOf {

    class Animal {
    }

    class Dog extends Animal {

        public String toDog() {
            return "Dog";
        }
    }

    class Cat extends Animal {

        public String toCat() {
            return "Cat";
        }
    }

    public void printAnimal(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println(dog.toDog());
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println(cat.toCat());
        }
    }
}
