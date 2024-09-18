package Day10;
public class Day10 {

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            System.out.println("Sabita" + i);
        }

        int[][] name = {
                { 2, 3, 4 },
                { 2, 3, 4 },
                { 2, 3, 4 },

        };

        System.out.println("name[0][1]" + name[0][1]);

        for (int i = 0; i < name.length; i++) {

            for (int j = 0; j < name[i].length; j++) {
                System.out.println(name[i][j] + "");
            }
            System.out.println();
        }

        // Write a program that finds the factorial of a given number using a for loop.
        int number = 5;
        int fictorial = 1;
        for (int i = 1; i <= number; i++) {
            fictorial *= i;
        }
        System.out.println("fictorial of " + number + " is " + fictorial);
        // break statement
        // While loop: Print numbers from 1 to 5, but break when number is 4
        int i = 1;
        System.out.println("Using while loop with break:");
        while (i <= 5) {
            if (i == 4) {
                break; // Exit the loop when i equals 4
            }
            System.out.println(i);
            i++;
        }

        // Do-while loop: Print numbers from 6 to 10, but break when number is 8
        int j = 6;
        System.out.println("\nUsing do-while loop with break:");
        do {
            if (j == 8) {
                break;
            }
            System.out.println(j);
            j++;
        } while (j <= 10);

        // For loop: Calculate the sum of numbers from 1 to 5, but break when number is3

        int sum = 0;
        System.out.println("\nUsing for loop with break:");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                break;

            }
            sum += k;
        }
        System.out.println("The sum of numbers from 1 to 2 (breaking at 3) is: " + sum);

        // continue statement
        // While loop: Print numbers from 1 to 5, but skip when number is 4
        int l = 1;
        System.out.println("Using while loop with continue:");
        while (l <= 5) {
            if (l == 4) {
                l++; // Increment l to avoid an infinite loop
                continue; // Skip the current iteration when i equals 4
            }
            System.out.println(l);
            l++;
        }

        // Do-while loop: Print numbers from 6 to 10, but skip when number is 8
        int m = 6;
        System.out.println("\nUsing do-while loop with continue:");
        do {
            if (m == 8) {
                m++;
                continue;
            }
            System.out.println(m);
            m++;
        } while (m <= 10);

        // For loop: Calculate the sum of numbers from 1 to 5, but skip number 3
        int summ = 0;
        System.out.println("\nUsing for loop with continue:");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                continue;
            }
            summ += k;
        }
        System.out.println("The sum of numbers from 1 to 5 (skipping 3) is: " + summ);

        // nested loop
        // Outer loop
        for (int k = 1; k <= 5; k++) {

            // Inner loop
            for (int o = 1; o <= 5; o++) {
                System.out.print(k * o + "\t"); // Print product of i and o
            }

            System.out.println(); // Move to the next line
        }

        for (int count = 0; count < 5; count++) {
            for (int k = 1; k < 5; k++) {
                System.out.println(k + " ");
            }
            System.out.println("count : " + count);
        }

        for (int count = 0; count < 5; count++) {
            for (int k = 1; k < count; k++) {
                System.out.println(k + " ");
            }
            System.out.println();
        }
        
    }
}
