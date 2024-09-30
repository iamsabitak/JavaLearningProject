package Day21;

public class AbstractClass {
    public static void main(String[] args) {

        Shape myCircle = new Circle(5);
        myCircle.display(); // Display shape type
        System.out.println("Area of Circle: " + myCircle.area());

        Shape myRectangle = new Rectangle(4, 6);
        myRectangle.display(); // Display shape type
        System.out.println("Area of Rectangle: " + myRectangle.area());

        // Creating a Car object
        Vehicle myCar = new Car(15.0);
        myCar.displayType();
        System.out.println("Car Fuel Efficiency: " + myCar.fuelEfficiency() + " km/l");

        // Creating a Truck object
        Vehicle myTruck = new Truck(10.0);
        myTruck.displayType();
        System.out.println("Truck Fuel Efficiency: " + myTruck.fuelEfficiency() + " km/l");

        // Creating a Full-Time Employee object
        Employee emp1 = new FullTimeEmployee("Alice", 5000);
        emp1.displayInfo();
        System.out.println("Full-Time Salary: $" + emp1.calculateSalary());

        // Creating a Part-Time Employee object
        Employee emp2 = new PartTimeEmployee("Bob", 20, 80);
        emp2.displayInfo();
        System.out.println("Part-Time Salary: $" + emp2.calculateSalary());
    }
}

abstract class Shape {
    // Abstract method for calculating area
    abstract double area();

    // Non-abstract method for displaying the type of shape
    public void display() {
        System.out.println("This is a shape");
    }
}

// Concrete class for Circle
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the abstract method
    @Override
    double area() {
        return length * width;
    }
}

// Problem 1: Create an Abstract Class for Vehicles
// Abstract class
abstract class Vehicle {
    // Abstract method for calculating fuel efficiency
    abstract double fuelEfficiency();

    // Non-abstract method
    public void displayType() {
        System.out.println("This is a vehicle");
    }
}

// Subclass Car
class Car extends Vehicle {
    private double mileage; // in km/l

    public Car(double mileage) {
        this.mileage = mileage;
    }

    @Override
    double fuelEfficiency() {
        return mileage; // Fuel efficiency in km/l
    }
}

// Subclass Truck
class Truck extends Vehicle {
    private double mileage;

    public Truck(double mileage) {
        this.mileage = mileage;
    }

    @Override
    double fuelEfficiency() {
        return mileage / 2;
    }
}

// Problem 2: Create an Abstract Class for Employees
// Abstract class
abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    // Abstract method for calculating salary
    abstract double calculateSalary();

    // Non-abstract method
    public void displayInfo() {
        System.out.println("Employee Name: " + name);
    }
}

// Subclass for Full-Time Employees
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary; // Monthly salary
    }
}

// Subclass for Part-Time Employees
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
