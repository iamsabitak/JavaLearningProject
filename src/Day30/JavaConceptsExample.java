package Day30;

public class JavaConceptsExample {

    public static void main(String[] args) {
        // Functional Interface
        Calculator add = (a, b) -> a + b; // Lambda Expression
        Calculator multiply = new Calculator() { // Anonymous Class
            @Override
            public int operate(int a, int b) {
                return a * b;
            }
        };

        // Using the lambda expression
        System.out.println("Addition (using Lambda): " + add.operate(5, 10));

        // Using the anonymous class
        System.out.println("Multiplication (using Anonymous Class): " + multiply.operate(5, 10));

        // Java Memory (Heap and Stack Example)
        // Create an Employee object which goes to the Heap memory
        Employee employee = new Employee("John Doe", 28);
        employee.showInfo(); // Stack memory holds this method call temporarily
    }
}

// 1. Functional Interface Example
@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

// 2. Java Memory Example: Heap and Stack Memory Example
class Employee {
    // Fields allocated in Heap memory as part of the Employee object
    private String name;
    private int age;

    // Constructor
    public Employee(String name, int age) {
        this.name = name; // Assigning values to heap variables
        this.age = age;
    }

    // Method which will use Stack memory for local variables and method calls
    public void showInfo() {
        String info = "Employee Name: " + name + ", Age: " + age; // info variable is stored on Stack
        System.out.println(info);
    }
}
