package Day18;

public class Encapsulation {
    public static void main(String[] args) {
        // Creating a new person object
        Person person = new Person("John", 25);

        // Accessing fields via getters and setters (encapsulated access)
        System.out.println("Initial Info:");
        person.displayInfo();

        // Changing the person's name and age using setters
        person.setName("Alice");
        person.setAge(30);

        // Displaying updated information
        System.out.println("Updated Info:");
        person.displayInfo();

        // Trying to set an invalid age
        person.setAge(-5); // Will trigger validation message
    }
}

class Person {
    // Private fields (variables) cannot be accessed directly from outside the class
    private String name;
    private int age;

    // Public constructor to initialize the object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age'
    public void setAge(int age) {
        if (age > 0) { // Simple validation to protect the data
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
