package Day4;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Problem 8: Implement a basic calculator using the switch statement.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number :");
        double numb1 = scanner.nextDouble();
        System.out.println("Enter Second Number :");
        double numb2 = scanner.nextDouble();

        System.out.println("Choose an operation: +, -, *, /");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(numb1 + numb2);
                break;

            case '/':
                System.out.println(numb1 / numb2);
                break;
            case '-':
                System.out.println(numb1 - numb2);
                break;
            case '*':
                System.out.println(numb1 * numb2);
                break;
            default:
                System.out.println("Invalid operator. choose +, -, *, or /.");
        }

        scanner.close();
    }
}
