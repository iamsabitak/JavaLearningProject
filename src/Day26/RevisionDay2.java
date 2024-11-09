package Day26;

public class RevisionDay2 {
    public static void main(String[] args) {
        // 1. Java Loops Overview
        System.out.println("Java Loops Overview:");

        // 2. Elements of Java Loops
        System.out.println("\nElements of Java Loops - Initialization, Condition, Update:");

        // 3. Java for Loop
        System.out.println("\nFor loop  - Printing numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 4. Java while Loop
        System.out.println("\nWhile loop  - Counting down from 5:");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        // 5. Java do-while Loop
        System.out.println("\nDo-while loop  - Executes at least once:");
        int number = 3;
        do {
            System.out.print(number + " ");
            number--;
        } while (number > 0);
        System.out.println();

        // 6. break Statement
        System.out.println("\nUsing break to exit a loop:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // Exits loop when i equals 3
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // 7. continue Statement
        System.out.println("\nUsing continue to skip an iteration:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skips iteration when i equals 3
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // 8. Nested Loops and Pattern Printing
        System.out.println("\nPattern Printing:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 9. Labeled break
        System.out.println("\nLabeled break - Exiting nested loops:");
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop; // Exits both loops when i equals 2 and j equals 2
                }
                System.out.print(i + "," + j + " ");
            }
            System.out.println();
        }

        // 10. Labeled continue
        System.out.println("\nLabeled continue - Skipping to next outer loop iteration:");
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    continue outerLoop; // Skips to the next iteration of the outer loop
                }
                System.out.print(i + "," + j + " ");
            }
            System.out.println();
        }

        // 11. Arrays in Java
        System.out.println("\nArrays in Java:");

        // 12. How does the Array Work?
        // Declaring an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // 13. Creating an Array in Java
        int[] newArray = new int[5]; // Array of length 5, default values are 0
        newArray[0] = 10;
        newArray[1] = 20;
        newArray[2] = 30;
        newArray[3] = 40;
        newArray[4] = 50;

        System.out.println("Array elements:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 14. for-each Loop in Java
        System.out.println("\nUsing for-each loop to iterate over array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 15. Multidimensional Arrays in Java
        System.out.println("\nMultidimensional Arrays:");

        // Creating a 2D array (3x3 matrix)
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Printing 2D array elements
        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
