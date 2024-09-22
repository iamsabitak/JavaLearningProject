public class Day14 {

    public static void main(String[] args) {
        Cylinder cy = new Cylinder(9, 12);

        System.out.println("volume " + cy.volume());

        System.out.println("area " + cy.area());
        // Problem 1
        Car car1 = new Car("Toyota", 120);
        car1.printCarDetails();
        car1.setSpeed(150).printCarDetails();

        // Problem 2
        Shape shape = new Shape(0);
        Square square = new Square(4);
        shape.printArea();
        square.printArea();

        // Problem 3
        Employee emp = new Employee(50000);
        Manager mgr = new Manager(60000, 10000);
        emp.printSalary();
        mgr.printSalary();
    }
}

class Cylinder {
    private int height;
    private int radius;

    public int getRaduis() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public double area() {
        return 2 * 3.14 * radius * radius + 2 * 3.14 * radius * height;
    }

    public double volume() {
        return 3.14 * radius * radius * height;
    }

    public Cylinder(int r, int h) {
        this.radius = r;
        this.height = h;
    }
}

// Problem 1: Car class with constructor and use of 'this' keyword
class Car {
    String brand;
    int speed;

    // Constructor using 'this' to reference instance variables
    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void printCarDetails() {
        System.out.println("Car brand: " + this.brand);
        System.out.println("Speed: " + this.speed + " km/h");
    }

    public Car setSpeed(int speed) {
        this.speed = speed;
        return this;
    }
}

// Problem 2: Shape and Square class with method overriding and 'super'
class Shape {
    double dimension;

    public Shape(double dimension) {
        this.dimension = dimension;
    }

    public double area() {
        return 0;
    }

    public void printArea() {
        System.out.println("Area: " + area());
    }
}

class Square extends Shape {

    public Square(double side) {
        super(side);
    }

    @Override
    public double area() {
        return dimension * dimension;
    }
}

// Problem 3: Employee and Manager class with 'super' and method overriding
class Employee {
    double baseSalary;

    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void printSalary() {
        System.out.println("Salary: " + calculateSalary());
    }
}

class Manager extends Employee {
    double bonus;

    public Manager(double baseSalary, double bonus) {
        super(baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}
