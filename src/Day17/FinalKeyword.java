package Day17;

class ParentClass {
    // final with Methods
    final void displayMessage() {
        System.out.println("This is a final method from ParentClass.");
    }
}

class ChildClass extends ParentClass {
    // Uncommenting the next code block will cause an error
    // void displayMessage() {
    // System.out.println("This is an attempt to override a final method.");
    // }
}

final class FinalClass {
    void showMessage() {
        System.out.println("This is a method from a final class.");
    }
}
// Uncommenting the next line will give a compilation error
// class AnotherClass extends FinalClass { }

public class FinalKeyword {
    public static void main(String[] args) {
        // final with Variables
        final int MAX_VALUE = 100;
        System.out.println("MAX_VALUE: " + MAX_VALUE);
        // Uncommenting the next line will give a compilation error
        // MAX_VALUE = 200; // Cannot change final variable

        ChildClass child = new ChildClass();
        child.displayMessage();

        FinalClass obj = new FinalClass();
        obj.showMessage();
    }
}
