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

public class MemoryExample {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Alice", 30);

        changeAge(person1);
        person1.display();

        person2.display();
    }

    // Method that modifies the object's age
    public static void changeAge(Person p) {
        p.age = 30; // Changing age through heap reference
    }
}
