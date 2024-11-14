package Day31;

// Class Person to demonstrate heap memory allocation
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
}

// Class Calculator to demonstrate compile-time polymorphism (method overloading)
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// Base class Animal to demonstrate run-time polymorphism (method overriding)
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class JavaExample {
    public static void main(String[] args) {
        // Demonstrating Heap and Stack Memory
        Person person1 = new Person("Alice", 30); // Stored in heap memory
        Person person2 = new Person("Alice", 30); 

        // Demonstrating Object class methods
        System.out.println("Person1: " + person1.toString()); // Uses toString() method
        System.out.println("Person1 equals Person2: " + person1.equals(person2)); // Uses equals() method

        // Demonstrating compile-time polymorphism (method overloading)
        Calculator calc = new Calculator();
        System.out.println("Integer addition: " + calc.add(5, 10));       // Calls int add()
        System.out.println("Double addition: " + calc.add(5.5, 10.2));   

        // Demonstrating run-time polymorphism (method overriding)
        Animal myAnimal = new Dog(); // Polymorphic reference
        myAnimal.sound(); // Calls Dog's sound() due to dynamic binding

        // Demonstrating Stack Memory with a method call
        int result = multiply(3, 4); // Local variables stored in stack memory
        System.out.println("Multiplication result: " + result);
    }

    public static int multiply(int a, int b) {
        int product = a * b; // 'product' stored in stack memory
        return product;
    }
}
