package Day18;

class AccessModifier {

    public String publicVar = "I am public"; // Accessible from anywhere
    private String privateVar = "I am private"; // Accessible only within this class
    protected String protectedVar = "I am protected"; // Accessible in package and subclasses
    String defaultVar = "I am default"; // Accessible only within the same package

    public void displayVariables() {
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
    }
}

// File: TestAccessModifiers.java
public class TestAccessModifiers {
    public static void main(String[] args) {
        AccessModifier example = new AccessModifier();
        example.displayVariables();

        // Accessing public variable
        System.out.println("Accessing public variable: " + example.publicVar);

        // Accessing private variable (will cause an error)
        // System.out.println("Accessing private variable: " + example.privateVar); //
        // Error

        // Accessing protected variable
        System.out.println("Accessing protected variable: " + example.protectedVar);

        // Accessing default variable
        System.out.println("Accessing default variable: " + example.defaultVar);
    }
}
