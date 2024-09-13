import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt();

        System.out.println("Enter the operator [+,-,/,*]");
        char opertaor = sc.next().charAt(0);

        // else if

        if (opertaor == '+') {
            double result = a + b;
            System.out.println("Addition : " + result);
        } else if (opertaor == '-') {
            double result = a - b;
            System.out.println("Subtraction : " + result);
        } else if (opertaor == '/') {
            double result = a / b;
            System.out.println("Division : " + result);
        } else if (opertaor == '*') {
            double result = a * b;
            System.out.println("Multiplication : " + result);
        } else {
            System.out.println("Invalid opertaor");
        }

        // using Switch
        // switch (opertaor) {
        //     case '+': {
        //         double result = a + b;
        //         System.out.println("Addition : " + result);
        //         break;
        //     }
        //     case '-': {
        //         double result = a - b;
        //         System.out.println("Subtraction : " + result);
        //         break;
        //     }
        //     case '*': {
        //         double result = a * b;
        //         System.out.println("Multiplication : " + result);
        //         break;
        //     }
        //     case '/': {
        //         double result = a / b;
        //         System.out.println("Division : " + result);
        //         break;
        //     }
        //     default:
        //         System.out.println("Invalid operator");

        // }

      


        sc.close();
    }
}
