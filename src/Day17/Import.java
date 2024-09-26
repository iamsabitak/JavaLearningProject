package Day17;

// Importing All Classes from a Package
import java.util.*;

// Importing a Specific Class
import java.util.Scanner;

public class Import {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter your favorite number: ");
        int number = scanner.nextInt();

        int randomNumber = random.nextInt(100);
        System.out.println("Your favorite number is: " + number);
        System.out.println("Random number generated is: " + randomNumber);

        scanner.close();
        sc.close();
    }
}
