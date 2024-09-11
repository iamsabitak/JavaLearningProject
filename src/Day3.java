import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
        float age1 = 12.12345687f; // A float shows up to 7 decimal digits of precision
        double age2 = 42.12345678910123456; // A double shows up to 15-16 decimal digits of precision
        
        System.out.println(age1);
        System.out.println(age2);

        int num = 10;
        double num0 = num;  // Implicit conversion from int to double
       System.out.println(num0);  // Output will be 10.0
    
       double num1 = 9.78;
       int num2 = (int) num1;  // Explicit conversion from double to int
       System.out.println(num2);  // Output will be 9 (fraction part is lost)

    //  int num = (int) true;  // Compilation error: incompatible types
          
     /* --- problem no 1 ---
    perform implicit conversion of number to result wher int var num with the value 15 and double var result and then perform explicit conversion to convert the result back to int. */
    
    int s = 15;
    double k = s;
    int t = (int)k;
   System.out.println("implicit:"+k);
   System.out.println("explicit:"+t);

    //    Operators (Arithmetic, Logical, Relational)
   // Arithmetic Operators
   int x = 10;
   int y = 5;
   
   System.out.println("Addition: " + (x + y));        // 15
   System.out.println("Subtraction: " + (x - y));     // 5
   System.out.println("Multiplication: " + (x * y)); // 50
   System.out.println("Division: " + (x / y));       // 2
   System.out.println("Modulus: " + (x % y));        // 0

   // Logical Operators
   boolean a = true;
   boolean b = false;
   //    AND (&&): Returns true if both operands are true. 
   System.out.println("Logical AND: " + (a && b));    // false
   // OR (||): Returns true if at least one of the operands is true.
   System.out.println("Logical OR: " + (a || b));     // true
   //    NOT (!): Reverses the logical state of its operand.
   System.out.println("Logical NOT: " + !a);          // false
   //XOR (^): Returns true if only one of the operands is true.
   System.out.println("Logical XOR: " + (a ^ b));     // true

   // Relational Operators
   System.out.println("Equal to: " + (x == y));       // false
   System.out.println("Not equal to: " + (x != y));   // true
   System.out.println("Greater than: " + (x > y));    // true
   System.out.println("Less than: " + (x < y));       // false
   System.out.println("Greater than or equal to: " + (x >= y)); // true
   System.out.println("Less than or equal to: " + (x <= y));    // false


   //Scanner class is a part of the java.util package and provides methods to read different types of input
   
    Scanner scanner = new Scanner(System.in);
    // Input two integers
    System.out.print("Enter first integer: ");
    int numb1 = scanner.nextInt();
    System.out.print("Enter second integer: ");
    int numb2 = scanner.nextInt();
    System.out.println("Addition: " + (numb1 + numb2));
    System.out.println("Subtraction: " + (numb1 - numb2));
    System.out.println("Multiplication: " + (numb1 * numb2));
    System.out.println("Division: " + (numb1 / numb2));
    System.out.println("Modulus: " + (numb1 % numb2));

    // problem no 2 // Create a Scanner object to read input
        Scanner scanner1 = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your name: ");
        String name = scanner1.nextLine();  // Read a line of text

        System.out.print("Enter your age: ");
        int age = scanner1.nextInt();  // Read an integer

        // Display the input
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");

        // Close the Scanner
        scanner.close();
        scanner1.close();
  
    }
}
