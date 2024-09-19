
import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        printGreeting("hello", "Sabita");
        averageOf2Number(4, 4);
        primeNumber(0);
        primeNumber(3);

        int result = factorial(5);
        System.out.println("The factorial of 5 is: " + result);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Operator: ");
        char Operator = scanner.next().charAt(0);

        switch (Operator) {
            case '+':
                System.out.print("Enter first numbers to add: ");
                int add1 = scanner.nextInt();
                System.out.print("Enter second numbers to add: ");
                int add2 = scanner.nextInt();
                System.out.println("Result: " + add(add1, add2));
                break;

            case '-':
                System.out.print("Enter first numbers to subtract: ");
                int sub1 = scanner.nextInt();
                System.out.print("Enter first numbers to subtract: ");
                int sub2 = scanner.nextInt();
                System.out.println("Result: " + subtract(sub1, sub2));
                break;

            case '*':
                System.out.print("Enter first numbers to multiply:  ");
                int mul1 = scanner.nextInt();
                System.out.print("Enter first numbers to multiply:  ");
                int mul2 = scanner.nextInt();
                System.out.println("Result: " + multiply(mul1, mul2));
                break;

            case '/':
                System.out.print("Enter first numbers to divide: ");
                int div1 = scanner.nextInt();
                System.out.print("Enter first numbers to divide:: ");
                int div2 = scanner.nextInt();
                System.out.println("Result: " + divide(div1, div2));
                break;
            default:
                System.out.println("Invalid Operator.");
        }

        scanner.close();

    }

    public static void printGreeting(String name, String greet) {
        System.out.println(greet + " " + name);
    }

    // Problem 1: Write a function that returns the average of two numbers
    public static int averageOf2Number(int a, int b) {
        int average = (a + b) / 2;
        System.out.println("average : " + average);
        return average;
    }

    // Problem 2: Create a method that checks whether a number is even or odd
    public static int primeNumber(int number) {

        if (number % 2 == 0) {

            System.out.println("The number " + number + " is a even number");

        } else {
            System.out.println("The number " + number + " is odd number");
        }
        return number;
    }

    // Problem 3: Write a method to calculate the factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Problem 4: Basic calculator
    public static int add(int a, int b) {
        return a + b;

    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return (double) a / b;
    }

}
