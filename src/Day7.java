import java.util.Arrays;

public class Day7 {
    public static void main(String[] args) {
        // int[] numbers; // Declares an array of integers
        // String[] names; // Declares an array of strings

        int[] number = new int[5];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;
        for (int i = 0; i < number.length; i++) {
            System.out.println("Number " + i + ": " + number[i]);
        }

        int[] numbers = { 10, 20, 30, 40 };
        String[] names = { "Alice", "Bob", "Charlie" };

        int firstNumber = numbers[0];
        String secondName = names[1];

        System.out.println("Number : " + firstNumber + " Name : " + secondName);

        String[] fruits = { "Apple", "Banana", "Mango", "Orange", "Grapes" };

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Fruit  " + i + ": " + fruits[i]);
        }

        // problem no 1
        int[] numb = { 10, 20, 30, 40, 50 };

        System.out.println("Array elements are:");
        for (int i = 0; i < numb.length; i++) {
            System.out.println(numb[i]);
        }

        // problem no 2
        int[] num = { 25, 14, 56, 77, 1, 98, 65 };
        int smallest = num[0];
        int largest = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
            if (num[i] > largest) {
                largest = num[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        // problemem no 3
        int[] nummbers = { 25, 14, 56, 77, 1, 98, 65 };

        // Sort in ascending order
        Arrays.sort(nummbers);
        System.out.println("Array elements in ascending order:");
        for (int nuum : nummbers) {
            System.out.println(nuum);
        }
    }
}
