package Day31;

// Java program demonstrating advanced examples of Heap and Stack Memory, Object class, and Polymorphism

// Base class Vehicle demonstrating polymorphism with method overriding
class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
    }

    // Method to display speed (to be overridden)
    public void displaySpeed() {
        System.out.println("Vehicle speed: " + speed + " km/h");
    }

    @Override
    public String toString() {
        return "Vehicle with speed: " + speed;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(speed);
    }
}

// Car class extending Vehicle and demonstrating method overriding and usage of super keyword
class Car extends Vehicle {
    int gear;

    Car(int speed, int gear) {
        super(speed); // Call to parent class constructor
        this.gear = gear;
    }

    @Override
    public void displaySpeed() {
        super.displaySpeed(); // Call the superclass method
        System.out.println("Car in gear: " + gear);
    }

    // Overloaded method to set the speed (method overloading)
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setSpeed(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
    }

    @Override
    public String toString() {
        return "Car with speed: " + speed + " km/h, in gear: " + gear;
    }
}

// Shape class for more examples of polymorphism
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle with length: " + length + " and width: " + width;
    }
}

public class AdvancedJavaExample {
    public static void main(String[] args) {
        // Demonstrating Heap and Stack Memory with Vehicle and Car
        Car myCar = new Car(120, 5); // myCar is stored in heap memory
        System.out.println("myCar.toString(): " + myCar); // Uses overridden toString method
        System.out.println("myCar.hashCode(): " + myCar.hashCode()); // Uses overridden hashCode method
        myCar.displaySpeed(); // Calls overridden method in Car

        // Demonstrate compile-time polymorphism (method overloading)
        myCar.setSpeed(150);
        myCar.setSpeed(150, 6); // Overloaded method with additional parameter

        // Demonstrate run-time polymorphism (method overriding)
        Vehicle vehicleRef = new Car(100, 4); // Polymorphic reference
        vehicleRef.displaySpeed(); // Calls overridden method in Car due to dynamic binding

        // Demonstrating abstract class and polymorphism with Shape, Circle, and Rectangle
        Shape myShape1 = new Circle(5);
        Shape myShape2 = new Rectangle(4, 6);
        
        System.out.println(myShape1); // Calls overridden toString method in Circle
        System.out.println("Area of Circle: " + myShape1.area()); // Calls overridden area() in Circle

        System.out.println(myShape2); // Calls overridden toString method in Rectangle
        System.out.println("Area of Rectangle: " + myShape2.area()); // Calls overridden area() in Rectangle

        // Demonstrating Stack Memory with a recursive method
        System.out.println("Factorial of 5: " + factorial(5)); // Local variables for each recursive call stored in stack memory
    }

    // Recursive method to calculate factorial demonstrating stack memory usage
    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1); // Each call to factorial creates a new frame in stack memory
    }
}
