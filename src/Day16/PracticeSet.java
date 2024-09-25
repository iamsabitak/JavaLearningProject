package Day16;

// Multilevel Inheritance
class Person {
    void showIdentity() {
        System.out.println("I am a person.");
    }
}

class Employee extends Person {
    void showJob() {
        System.out.println("I work as an employee.");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("I manage the team.");
    }
}

// Method Overriding in Inheritance
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class PracticeSet {
    public static void main(String[] args) {
        // Multilevel Inheritance
        Manager manager = new Manager();
        manager.showIdentity();
        manager.showJob();
        manager.manage();

        // Create Shape references for Circle and Rectangle
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw();
        shape2.draw();

    }
}
