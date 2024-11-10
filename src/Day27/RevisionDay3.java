package Day27;

public class RevisionDay3 {

    // Method without parameters
    public void greet() {
        System.out.println("Hello, welcome to the Java Methods Overview!");
    }

    // Method with parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method demonstrating Math class methods
    public void mathExamples() {
        System.out.println("Math.abs(-10): " + Math.abs(-10));
        System.out.println("Math.max(5, 10): " + Math.max(5, 10));
        System.out.println("Math.sqrt(25): " + Math.sqrt(25));
    }

    // Method for string creation and demonstrating immutability
    public void stringExamples() {
        String str1 = "Java";
        String str2 = "Programming";
        System.out.println("Concatenated String: " + str1 + " " + str2);

        // Immutable demonstration
        str1 = str1.concat(" Basics");
        System.out.println("Modified String: " + str1);
    }

    // Method demonstrating string comparison
    public void compareStrings() {
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
        System.out.println("str1 == str3: " + (str1 == str3)); // checks reference
    }

    // Overloaded methods (method overloading)
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // Constructor with the 'this' keyword
    private String name;
    private int age;

    public  RevisionDay3 (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public static void main(String[] args) {
        // Creating an object (Classes and Objects)
        RevisionDay3  example = new  RevisionDay3 ("Alice", 25);

        // Calling a method without parameters
        example.greet();

        // Calling a method with parameters
        System.out.println("Addition result: " + example.add(5, 10));

        // Calling Math examples method
        example.mathExamples();

        // String examples
        example.stringExamples();

        // Comparing strings
        example.compareStrings();

        // Method overloading examples
        System.out.println("Integer multiplication: " + example.multiply(5, 4));
        System.out.println("Double multiplication: " + example.multiply(5.5, 4.5));

        // Displaying object information using 'this' keyword
        example.displayInfo();
    }
}
