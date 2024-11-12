package Day29;

// 1. Java Abstraction Overview - Creating an abstract class Shape
abstract class Shape {
    abstract void draw();

    abstract double calculateArea();
}

// 2. Java Abstract Class - Defining an abstract class Vehicle with both
// abstract and concrete methods
abstract class Vehicle {
    abstract void move();

    void displayType() {
        System.out.println("This is a vehicle.");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is moving.");
    }
}

// 3. Java Abstraction - Abstracting bank operations in an abstract class
abstract class BankAccount {
    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

// 4. Java Interfaces - Defining an Animal interface with specific behaviors
interface Animal {
    void makeSound();

    void move();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

    @Override
    public void move() {
        System.out.println("Dog is running.");
    }
}

// 5. Advantages of Java Interfaces - Multiple inheritance with interfaces
interface Electric {
    void charge();
}

interface Drivable {
    void drive();
}

class ElectricCar implements Electric, Drivable {
    @Override
    public void charge() {
        System.out.println("Charging electric car.");
    }

    @Override
    public void drive() {
        System.out.println("Driving electric car.");
    }
}

// 6. Default functions in Interfaces - Adding a default method in Flyable
// interface
interface Flyable {
    void fly();

    default void takeOff() {
        System.out.println("Taking off.");
    }
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

// 7. Inner classes and Nested Static class in Java - Inner and static nested
// classes in Computer
class Computer {
    // Inner class
    class Processor {
        void process() {
            System.out.println("Processor is processing.");
        }
    }

    // Static nested class
    static class USBPort {
        static void connect() {
            System.out.println("USB connected.");
        }
    }
}

// 8. Anonymous Classes in Java - Creating an anonymous Runnable class
public class Revision_Day5 {
    public static void main(String[] args) {
        // Abstract Class example
        Car car = new Car();
        car.move();
        car.displayType();

        // Interface example
        Dog dog = new Dog();
        dog.makeSound();
        dog.move();

        // Default function in Interface example
        Bird bird = new Bird();
        bird.fly();
        bird.takeOff();

        // Inner and Static Nested Class example
        Computer computer = new Computer();
        Computer.Processor processor = computer.new Processor();
        processor.process();
        Computer.USBPort.connect();

        // Anonymous Class example
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in an anonymous class.");
            }
        };
        runnable.run();

        // Functional Interface example
        Calculator add = (a, b) -> a + b;
        System.out.println("Addition result: " + add.calculate(5, 3));
    }
}

// 9. Functional Interfaces - Defining a Calculator functional interface with
// lambda expression
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
