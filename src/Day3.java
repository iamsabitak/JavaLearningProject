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

    }
}
