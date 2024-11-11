package Day28;

// Superclass: Vehicle
class Vehicle {
    public final int wheels = 4;

    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public final void showWheels() {
        System.out.println("This vehicle has " + wheels + " wheels.");
    }
}

// Subclass: Car
class Car extends Vehicle {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public void start() {
        super.start();
        System.out.println(this.brand + " car is starting...");
    }

    public void displayDetails() {
        System.out.println("Brand: " + this.brand);
        super.showWheels();
    }
}

// Superclass: Shape
class Shape {
    public final String type = "2D Shape";

    public Shape() {
        System.out.println("Shape constructor called");
    }

    public void draw() {
        System.out.println("Drawing a shape...");
    }

    public final void displayType() {
        System.out.println("This is a " + type);
    }
}

// Subclass: Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
        System.out.println("Circle constructor called");
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a circle with radius " + this.radius);
    }

    public void showDetails() {
        System.out.println("Circle radius: " + this.radius);
        super.displayType();
    }
}

// Main class to test inheritance and method overriding
public class RevisionDay4 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.start();
        myCar.displayDetails();

        Circle myCircle = new Circle(5.0);
        myCircle.draw();
        myCircle.showDetails();
    }
}
