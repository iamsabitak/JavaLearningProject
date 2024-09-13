import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt();

        System.out.println("Enter the operator [+,-,/,*]");
        char opertaor = sc.next().charAt(0);

        // else if

        if (opertaor == '+') {
            double result = a + b;
            System.out.println("Addition : " + result);
        } else if (opertaor == '-') {
            double result = a - b;
            System.out.println("Subtraction : " + result);
        } else if (opertaor == '/') {
            // nested
            if (b != 0) {
                double result = a / b;
                System.out.println("Division : " + result);
            } else {
                System.out.println("cannot divided by zero");
            }

        } else if (opertaor == '*') {
            double result = a * b;
            System.out.println("Multiplication : " + result);
        } else {
            System.out.println("Invalid opertaor");
        }

        // using Switch
        // switch (opertaor) {
        // case '+': {
        // double result = a + b;
        // System.out.println("Addition : " + result);
        // break;
        // }
        // case '-': {
        // double result = a - b;
        // System.out.println("Subtraction : " + result);
        // break;
        // }
        // case '*': {
        // double result = a * b;
        // System.out.println("Multiplication : " + result);
        // break;
        // }
        // case '/': {
        // double result = a / b;
        // System.out.println("Division : " + result);
        // break;
        // }
        // default:
        // System.out.println("Invalid operator");

        // }

        // Ternery opertor

        int number = 2;

        String result = (number % 2 == 0) ? "even" : "odd";

        System.out.println(result);

        // Write a program to check whether a given year is a leap year or not using the
        // ternary operator.

        Scanner yr = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int year = yr.nextInt();
        String resultY = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "Leap Year" : "Not a Leap Year";

        System.out.println(resultY);

        
        yr.close();
        sc.close();
    }
}
