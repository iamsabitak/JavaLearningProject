public class Day3 {
    public static void main(String[] args) {
        float age1 = 2.1234567f; 
        double age2 = 2.123456789101112;
        System.out.println(age1);
        System.out.println(age2);

        int num = 10;
        double num0 = num;  // Implicit conversion from int to double
       System.out.println(num0);  // Output will be 10.0
    
       double num1 = 9.78;
       int num2 = (int) num1;  // Explicit conversion from double to int
       System.out.println(num2);  // Output will be 9 (fraction part is lost)

    //    int num = (int) true;  // Compilation error: incompatible types
          
    //    problem no 1
    // Perform implicit conversion of number to result wher int var num with the value 15 and double var result and then perform explicit conversion to convert the result back to int.
    
    int s = 15;
    double k = s;
    int b = (int)k;
   System.out.println("implicit:"+k);
   System.out.println("explicit:"+b);
  

    }
}
