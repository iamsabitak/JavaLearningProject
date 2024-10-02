package Day23;

import java.util.function.BiFunction;

// @FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class FunctionalInterface {

    public static void main(String[] args) {
        // Common Functional Interfaces in Java:
        // Lambda for addition
        Calculator addition = (a, b) -> a + b;

        // Lambda for subtraction
        Calculator subtraction = (a, b) -> a - b;

        // Lambda for multiplication
        Calculator multiplication = (a, b) -> a * b;

        // Lambda for division
        Calculator division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Cannot divide by zero");
                return 0;
            }
        };

        // Using the lambdas
        System.out.println("Addition of 10 and 5: " + addition.calculate(10, 5));
        System.out.println("Subtraction of 10 and 5: " + subtraction.calculate(10, 5));
        System.out.println("Multiplication of 10 and 5: " + multiplication.calculate(10, 5));
        System.out.println("Division of 10 and 5: " + division.calculate(10, 5));
        System.out.println("Division of 10 and 0: " + division.calculate(10, 0));

        // Using Built-in Functional Interfaces
        // Using BiFunction for addition
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        // Using BiFunction for subtraction
        BiFunction<Integer, Integer, Integer> subtract = (a, b) -> a - b;

        // Using BiFunction for multiplication
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        // Using BiFunction for division
        BiFunction<Integer, Integer, Integer> divide = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                System.out.println("Cannot divide by zero");
                return 0;
            }
        };

        // Perform the calculations
        System.out.println("Addition: " + add.apply(10, 5));
        System.out.println("Subtraction: " + subtract.apply(10, 5));
        System.out.println("Multiplication: " + multiply.apply(10, 5));
        System.out.println("Division: " + divide.apply(10, 5));
        System.out.println("Division by zero: " + divide.apply(10, 0));
    }
}
