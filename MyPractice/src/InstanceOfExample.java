
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void fetch() {
        System.out.println("Fetching the ball");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public void scratch() {
        System.out.println("Scratching the furniture");
    }
}

public class InstanceOfExample {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        testInstance(genericAnimal);
        testInstance(myDog);
        testInstance(myCat);
    }

    public static void testInstance(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("It's a Dog!");
            Dog dog = (Dog) animal;
            dog.fetch(); // Accessing Dog-specific method
        } else if (animal instanceof Cat) {
            System.out.println("It's a Cat!");
            Cat cat = (Cat) animal;
            cat.scratch(); // Accessing Cat-specific method
        } else {
            System.out.println("It's some other Animal!");
        }
    }
}
