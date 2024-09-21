// Problem 1: Person class with attributes name, age, and gender
class Person {

    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

// Problem 2: Circle class with methods to calculate area and circumference
class Circle {

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void printCircleDetails() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

// Problem 3 Student class with methods to calculate average marks of three
// subject

class Student {

    double subject1, subject2, subject3;

    public Student(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public double calculateAverage() {
        return (subject1 + subject2 + subject3) / 3;
    }

    public void printStudentDetails() {
        System.out.println("Marks: " + subject1 + ", " + subject2 + ", " + subject3);
        System.out.println("Average Marks: " + calculateAverage());
    }
}

public class Day13 {
    public static void main(String[] args) {
        // Problem 1: Create Person objects and print their details
        Person person1 = new Person("John", 25, "Male");
        Person person2 = new Person("Alice", 30, "Female");
        System.out.println("Person 1 Details:");
        person1.printDetails();
        System.out.println("\nPerson 2 Details:");
        person2.printDetails();

        // Problem 2: Create Circle object and print its area and circumference
        Circle circle = new Circle(5.0);
        System.out.println("\nCircle Details:");
        circle.printCircleDetails();

        // Problem 3: Create Student object and print the average marks
        Student student = new Student(85, 90, 78); // Marks of three subjects
        System.out.println("\nStudent Details:");
        student.printStudentDetails();
    }
}
