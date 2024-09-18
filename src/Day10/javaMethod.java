package Day10;

public class javaMethod {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int calculateArea(int width, int height) {
        return width * height;
    }

    public static void main(String[] args) {
        // Calling the add method
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);

        // Calling the max method
        int maximum = max(7, 9);
        System.out.println("Maximum: " + maximum);

        // Calling the calculateArea method
        int width = 5;
        int height = 10;
        int area = calculateArea(width, height);
        System.out.println("The area of the rectangle is: " + area);

        // Calling the printGreeting method
        printGreeting("Alice");
    }
}