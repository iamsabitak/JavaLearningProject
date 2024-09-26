package Day17;

//learned about packages
public class MathClass {
    public static void main(String[] args) {
        // Absolute value
        int negativeNumber = -15;
        int absValue = Math.abs(negativeNumber);
        System.out.println("Absolute value of " + negativeNumber + " is: " + absValue);

        // Maximum of two numbers
        int a = 10, b = 20;
        int maxValue = Math.max(a, b);
        System.out.println("Maximum of " + a + " and " + b + " is: " + maxValue);

        // Minimum of two numbers
        int minValue = Math.min(a, b);
        System.out.println("Minimum of " + a + " and " + b + " is: " + minValue);

        // Square root
        double number = 25;
        double sqrtValue = Math.sqrt(number);
        System.out.println("Square root of " + number + " is: " + sqrtValue);

        // Power calculation
        double base = 2, exponent = 3;
        double powerValue = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + powerValue);

        // Rounding methods
        double num = 5.8;
        System.out.println("Ceiling of " + num + " is: " + Math.ceil(num));
        System.out.println("Floor of " + num + " is: " + Math.floor(num));
        System.out.println("Rounding " + num + " gives: " + Math.round(num));

        // Random number generation between 0 and 1
        double randomValue = Math.random();
        System.out.println("Random value between 0.0 and 1.0: " + randomValue);

        // Generating a random number between 1 and 100
        int randomInt = (int) (Math.random() * 100) + 1;
        System.out.println("Random integer between 1 and 100: " + randomInt);

        // Trigonometric functions
        double angle = Math.PI / 4;
        System.out.println("Sine of 45 degrees: " + Math.sin(angle));
        System.out.println("Cosine of 45 degrees: " + Math.cos(angle));
        System.out.println("Tangent of 45 degrees: " + Math.tan(angle));
    }
}