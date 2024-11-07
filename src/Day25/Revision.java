package Day25;

import java.util.Scanner;

// 1 Revision Program
public class Revision {

    // 2. Variables and Data Types
    int integerVar = 10;
    double doubleVar = 20.5;
    char charVar = 'S';
    String stringVar = "Hello, sabbu!";
    boolean boolVar = true;

    // -- Integer Types
    byte number1 = 100; // (-128 to 127)
    short number2 = 20000; // (-32,768 to 32,767)
    int number3 = 25; // (-2,147,483,648 to 2,147,483,647)
    long number14 = 123456789L; // (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)

    // -- Floating-Point Types
    float price = 10.99f; // 'f' suffix for float
    double salary = 45000.75;

    // -- Character Type
    char grade = 'A';

    // -- Boolean Type
    boolean isPassed = true;

    // -- String Type
    String name = "Sabita";

    public static void main(String[] args) {
        System.out.println("Welcome to Java Revision Program");

        // 5. Java Keywords and Variables
        int age = 19;
        String name = "Sabita";

        // 6. Data Types and Implicit Conversion
        double salary = age; // Implicit conversion

        // 7. Comments in Java
        // Single-line comment
        /* Multi-line comment */

        // 8. Binary Number System
        int binaryNum = 0b1010; // Binary representation of decimal 10
        System.out.println("Binary 1010 in decimal is: " + binaryNum);

        // 9. Binary to Decimal Conversion
        int decimal = Integer.parseInt("1010", 2);
        System.out.println("Binary '1010' to decimal: " + decimal);

        // 10. Binary Addition and Subtraction
        int a = 5;
        int b = 3;
        System.out.println("Binary Addition (5 + 3): " + (a + b));
        System.out.println("Binary Subtraction (5 - 3): " + (a - b));

        // 11. Two’s Complement
        int twosComplement = ~a + 1;
        System.out.println("Two's Complement of 5: " + twosComplement);

        // 12. Types of Operators
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int quot = a / b;

        a += 2; // Assignment Operator

        System.out.println("Is age > 18? " + (age > 18));

        boolean result = (age > 18) && (salary > 5000);
        System.out.println("Logical AND of age and salary: " + result);

        int bitwiseAnd = a & b;
        System.out.println("Bitwise AND: " + bitwiseAnd);

        int count = 10;
        count++;
        System.out.println("Incremented Count: " + count);
        String eligibility = (age >= 18) ? "Eligible" : "Not Eligible";
        System.out.println("Voting Eligibility: " + eligibility);

        Scanner scanner = new Scanner(System.in);

        // 13 Taking user input
        System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        // 14 Java Conditional Statements

        // 15 if-else Statements
        if (userAge >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // 16 if-else-if-else Statements
        if (userAge < 13) {
            System.out.println("You are a child.");
        } else if (userAge < 18) {
            System.out.println("You are a teenager.");
        } else if (userAge < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        // 17 Nested if-else Statements
        if (userAge > 0) {
            if (userAge < 18) {
                System.out.println("You are underaged.");
            } else {
                System.out.println("You are eligible to vote.");
            }
        } else {
            System.out.println("Invalid age entered.");
        }

        // 18 Ternary Operator
        String voteEligibility = (userAge >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Voting eligibility: " + voteEligibility);

        // 19 Switch Statements
        System.out.print("Enter a day number (1 for Monday, 7 for Sunday): ");
        int day = scanner.nextInt();

        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("The day is: " + dayName);

        scanner.close();
    }
}
