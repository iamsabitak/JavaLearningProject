package Day20;

abstract class Animal {

    public abstract void sound();

    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

class Dog extends Animal {

    public void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {

    public void sound() {
        System.out.println("The cat meows.");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();

        dog.sleep();
        cat.sleep();
    }
}