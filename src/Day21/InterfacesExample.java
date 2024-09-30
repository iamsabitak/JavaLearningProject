package Day21;

// Defining the interface
interface Animal {
    void eat();

    void makeSound();
}

// Implementing the Animal interface in Dog class
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("The dog eats dog food.");
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Implementing the Animal interface in Cat class
class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("The cat eats cat food.");
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class InterfacesExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.eat();
        myDog.makeSound();

        Animal myCat = new Cat();
        myCat.eat();
        myCat.makeSound();
    }

}