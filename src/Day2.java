public class Day2 {
    public static void main(String[] args) {
        // Rules for Naming Variables in Java
        int age = 19;  // allowed 
        double _salary = 45000.50;  // allowed 
        String $name = "Sabita";  // allowed 
  // int 1age = 20;  // cannot start with a digit
        
        String fullName = "Sabita Khadka";  // allowed (camelcase notation)
        // String fullname = "Sabita Khadka";  // allowed  but avoid this
    
      // String full Name = "Sabita Khadka";  // not allowed (cannot contain spaces)

    //   int class = 10;  // not allowed (class is a keyword)
      // double static = 100.5;  // not allowed (static is a keyword)
       String myClass = "Bachelor";  // allowed (use a custom name)

       int numberOfStudents = 30;  // Descriptive variable name

        System.out.println(age);
        System.out.println(_salary);
        System.out.println($name);
        System.out.println(fullName);
        System.out.println(numberOfStudents);
        System.out.println(myClass);

        
    //   JAVA DATA TYPES
    //   Primitive datatype

    // -- Integer Types
    byte number1= 100; //(-128 to 127)
    short number2 = 20000;// (-32,768 to 32,767)
    int number3 = 25;//(-2,147,483,648 to 2,147,483,647)
    long number14 = 123456789L;//(-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)

    // -- Floating-Point Types
    float price = 10.99f;  // Need to add 'f' to indicate float
    double salary = 45000.75;

    // -- Character Type
    char grade = 'A';

    // -- Boolean Type
    // boolean marks; //--default false
    boolean isPassed = true;

    // -- String Type
    String name = "Sabita Khadka";


    System.out.println("Byte: " + number1);
    System.out.println("Short: " + number2);
    System.out.println("Int: " + number3);
    System.out.println("Long: " + number14);

    System.out.println("Float: " + price);
    System.out.println("Double: " + salary);

    System.out.println("Char: " + grade);

    System.out.println("Boolean (marks): " + false);  // Default value
    System.out.println("Boolean (isPassed): " + isPassed);

    System.out.println("String: " + name);

  // -- Problem no 1 find the volume and tsa of cuboid which have w = 2, l = 3 and h= 4.
  
  int width = 2;
  int length = 3;
  int height = 4;

  int volume =length* width * height;
 
   int surfaceArea = 2 * (length * width + width * height + height * length);

   boolean isCube = (length == width) && (width == height);

   System.out.println("Volume :" + volume);
   System.out.println("surfaceArea :" + surfaceArea);
   System.out.println("Is Cube: " + isCube);

    }
}
