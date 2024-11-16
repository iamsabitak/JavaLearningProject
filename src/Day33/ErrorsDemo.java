package Day33;

import java.util.Scanner;

public class ErrorsDemo {
    public static void main(String[] args) {
        // System.out.println(a) <-- this type of error is known as Syntax error.

        /*
         * →A logical error or a bug occurs when a program compiles and round but does
         * the
         * wrong thing such as {Message delivered wrongly,Wrong time of chats being
         * displayed,
         * Incorrect redirects!}
         */

        // SYNTAX ERROR DEMO
        // int a = 0 //Error: no semicolon
        // b = 0; //Error: b not declared!

        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);
        }

        // RUNTIME ERROR
        int k;
        while (true) {
            System.out.println("Enter a numbers");
            try (Scanner sc = new Scanner(System.in)) {
                k = sc.nextInt();
            }
            System.out.println("Integer part of 1000 divided by k is " + 1000 / k);
        }
    }
}
