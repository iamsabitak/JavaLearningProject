public class Day8 {
    public static void main(String[] args) {

        // java types
        // primitive
        byte age = 18;// -128to 127
        char letter = 's';
        int number = 1234567890;
        long number2 = 123456789000L;
        float pi = 3.14F;
        boolean isAdult = true;
        double myDouble = 3.679d;// 15 decimal digits
        short num = 32; // -32,768 to 32,767

        String txt = "Learning java";
        String name1 = "Sabita";
        String name2 = "Nabin";
        String name0 = "sabita and janki";
        String name3 = name1.replace("i", "e");
        String name4 = name1 + " and " + name2;
        System.out.println(name4);

        // concatenate
        System.out.println(name1.length());
        // length
        System.out.println(name2.charAt(4));
        // charAt
        System.out.println(name3);
        // replace
        System.out.println(name0.substring(0, 7));
        // substring
        System.out.println(txt.toUpperCase());
        // toUpperCase
        System.out.println(txt.toLowerCase());
        // toLowerCase
        System.out.println(txt.indexOf("sabita"));


        System.out.println("Hello, World!");
      String name = "sabita";
      
      System.out.println(name.trim());
      System.out.println(name.startsWith("sa"));
      System.out.println(name.endsWith("ta"));
      System.out.println(name.indexOf("ta"));
      System.out.println(name.lastIndexOf("ta"));
      System.out.println(name.charAt(3));
      System.out.println(name.substring(2,4));
      System.out.println(name.length());
      System.out.println(name.replace("ta","ce"));
      System.out.println(name.replace("a","n"));
      System.out.println(name.toUpperCase());
      System.out.println(name.toLowerCase());
      System.out.println(name.equals("sabita"));
      System.out.println(name.equalsIgnoreCase("Sa"));
      String name7 = " niru ";
      String name5 = name +" and "+ name7;
      System.out.println(name.concat(name7));
      System.out.println(name5);
     System.out.println(" dear " + name +" thanks a lot");
            String name6 = "dear <|niru|> ,thanks a lot";
      System.out.println(name6.replace("<|niru|>","sabu"));



        char grade = 'A';
        grade = (char)(grade+8);//encrypting the grade by adding 8
        System.out.println(grade);
          grade = (char)(grade-8);//decrypting the value to show the real garde
       System.out.println(grade);

       


    }
}
