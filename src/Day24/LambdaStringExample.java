package Day24;

// @FunctionalInterface
interface StringConcatenator {
    String concatenate(String str1, String str2);
}
interface Calculator {
    int add(int a, int b);
}

public class LambdaStringExample {
    public static void main(String[] args) {
        // Lambda expression implementing the concatenate method
        StringConcatenator concat = (str1, str2) -> str1 + " " + str2;
        
        // Test the lambda expression
        String result = concat.concatenate("Hello", "World");
        System.out.println(result);  // Output: Hello World

        Calculator calculator = (a, b) -> a + b;
        
        System.out.println("Sum: " + calculator.add(5, 3));
    }
}
