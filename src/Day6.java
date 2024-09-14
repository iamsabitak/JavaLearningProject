import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {

        // Problem no 1 program to find the fictorial of a given number using for loop.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is " + factorial);

        // problem no 2 program to print even numbers from 1 to 20
        int numb = 1;
        while (numb <= 20) {
            if (numb % 2 == 0) {
                System.out.println(numb);
            } else {
                System.out.println("odd number");

            }
            numb++;
        }

        // problem no 3 Using a for loop, calculate the sum of first n natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        // problem no 4 Using a for loop, print the Fibonacci series and its sum
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int number = scr.nextInt();

        int firstTerm = 0, secondTerm = 1;
        int summ = firstTerm + secondTerm;
        System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);

        for (int i = 3; i <= number; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" , " + nextTerm);
            summ += nextTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println("\nSum of the first " + number + " Fibonacci numbers: " + summ);

        // problem no 5 program to check if a number is prime or not

        Scanner scannerr = new Scanner(System.in);
        System.out.print(" Enter a number: ");
        int numberr = scannerr.nextInt();
        boolean isPrime = true;

        if (numberr <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= numberr / 2; i++) {
                if (numberr % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(numberr + " is a prime number.");
        } else {
            System.out.println(numberr + " is not a prime number.");
        }

        scannerr.close();
        scr.close();
        sc.close();
        scanner.close();
    }

}
