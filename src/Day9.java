public class Day9 {
    public static void main(String[] args) {
        
        String[] names = new String[5];
        names[0] = "sabbu";
        names[1] = "babbu";
        names[2] = "kabbu";
        names[3] = "dabbu";
        names[4] = "aabbu";

        for (String name : names) {
            System.out.println(name);
        }

        // int[][] matrix = new int[3][3];
        // matrix[0][0] = 13;
        // matrix[0][1] = 12;
        // matrix[0][2] = 11;

        // matrix[1][0] = 15;
        // matrix[1][1] = 7;
        // matrix[1][2] = 9;

        // matrix[2][0] = 9;
        // matrix[2][1] = 10;
        // matrix[2][2] = 16;
        int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
        };

        System.out.println("Element at [0][0]: " + matrix[0][0]);
        System.out.println("Element at [1][2]: " + matrix[1][2]);

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // create a 3d array
        int[][][] arr = {
                {
                        { 1, 2, 3, 5 },
                        { 4, 5, 6, 61 }
                },
                {
                        { 7, 8, 9, 62 },
                        { 10, 11, 12 }
                },
                {
                        { 13, 14, 15 },
                        { 16, 17, 18 }
                }
        };

        System.out.println("Element at [0][1][2]: " + arr[0][1][2]);
        System.out.println("Element at [2][0][1]: " + arr[2][0][1]);

        System.out.println("3D Array elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // problem 1: Sum of All Elements
        int[] numbs = { 10, 20, 30, 40, 50 };
        int sum = 0;

        for (int number : numbs) {
            sum += number;
        }

        System.out.println("Sum of array elements: " + sum);
        // problem 2: Find the Largest Element
        int[] numbers = { 12, 34, 56, 78, 99, 43 };
        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println("Largest element: " + largest);

        // problem no 3 : create a 2d array print marks of 4 students in 3 subjects
        // int[][] marks = new int[4][3];
        // marks[0][0] = 12;
        // marks[0][1] = 98;
        // marks[0][2] = 34;

        // marks[1][0] = 12;
        // marks[1][1] = 67;
        // marks[1][2] = 87;

        // marks[2][0] = 12;
        // marks[2][1] = 98;
        // marks[2][2] = 34;

        // marks[3][0] = 12;
        // marks[3][1] = 67;
        // marks[3][2] = 87;

        int[][] marks = {
                { 12, 98, 34 },
                { 33, 44, 55 },
                { 55, 66, 77 },
                { 66, 77, 88 },
        };
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        // problem 4: Sum of Each Row in a 2D Array
        int[][] matrixs = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < matrixs.length; i++) {
            int rowSum = 0;

            for (int j = 0; j < matrixs[i].length; j++) {
                // rowSum = rowSum + matrixs[i][j];
                rowSum += matrixs[i][j];
            }

            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

    }
}
