package Day4;

import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        // if statement
        int age = 18;
     if (age >= 18) {
    System.out.println("You are an adult.");
   }

//    if-else statement
 if (age <= 17) {
    System.out.println("You are an minor.");
} else {
    System.out.println("You are a adult.");
}
// else-if 
int marks = 85;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 80) {
    System.out.println("Grade B");
} else if (marks >= 70) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}

// switch statement
int day = 0;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}

    // Problem no 1 Write a program that checks if a number is even or odd.
 Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
       
      //Problem no 2 Program to Compare Two Numbers
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner1.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner1.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal.");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2 + ".");
        } else {
            System.out.println(num1 + " is less than " + num2 + ".");
        }

          //Problem 3 Java Program to Check Voting Eligibility
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int agee = scanner2.nextInt();
        if (agee >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();

        scanner1.close();

        scanner2.close();
  
    }
}
