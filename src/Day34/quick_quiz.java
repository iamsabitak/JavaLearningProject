package Day34;
import java.util.Scanner;

public class quick_quiz {
    public static void main(String[] args) {
      int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of index");
                int ind = sc.nextInt();
                try {
                    System.out.println("Welcome");
                    try {
                        System.out.println(marks[ind]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Sorry this index does not exist");
                        System.out.println("Exception in level 2");
                    }
                } catch (Exception e) {
                    System.out.println("Exception in level 1");
                }
        }  
        System.out.println("Thanks for using code");
        }
}
