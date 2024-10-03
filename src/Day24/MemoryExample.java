package Day24;

class Person {
    String name; // Instance variable (Heap memory)
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Car {
    String model; // Instance variable (Heap memory)
    int year;

    // Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

public class MemoryExample {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Alice", 30);

        changeAge(person1);
        person1.display();

        person2.display();
        Car car1 = new Car("Tesla", 2020);
        Car car2 = new Car("BMW", 2018);

        car1.display();
        car2.display();

        modifyCar(car1);
        car1.display();
    }

    public static void changeAge(Person p) {
        p.age = 30;
    }

    public static void modifyCar(Car c) {
        c.model = "Tesla Model X";
    }
}
