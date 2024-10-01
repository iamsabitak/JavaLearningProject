package Day22;

// Interface with a default method
interface Animal {
    // Abstract method
    void sound();

    // Default method with implementation
    default void eat() {
        System.out.println("The animal is eating.");
    }
}

// Implementing class (Dog) that overrides the abstract method
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }

    // No need to override the default method unless customization is needed
}

// Implementing class (Cat) that overrides both abstract and default methods
class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }

    // Overriding the default method
    @Override
    public void eat() {
        System.out.println("Cat is eating fish.");
    }
}

// Inner Class (Non-static Nested Class)
class OuterClass {
    private String message = "Hello from Outer Class";

    // Inner class
    class InnerClass {
        // Method of inner class
        public void display() {
            System.out.println(message); // Accessing outer class's private variable
        }
    }
}

// Static Nested Class
class OuterClasss {
    private static String staticMessage = "Hello from Outer Class (static)";

    // Static nested class
    static class StaticNestedClass {
        // Method of static nested class
        public void display() {
            System.out.println(staticMessage); // Accessing outer class's static variable
        }
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound(); // Output: Dog barks.
        dog.eat(); // Output: The animal is eating. (using default implementation)

        Cat cat = new Cat();
        cat.sound(); // Output: Cat meows.
        cat.eat(); // Output: Cat is eating fish. (overrides default implementation)

        // Inner Class (Non-static Nested Class)
        // Create an instance of the outer class
        OuterClass outer = new OuterClass();

        // Create an instance of the inner class using the outer class instance
        OuterClass.InnerClass inner = outer.new InnerClass();

        // Call method of the inner class
        inner.display(); // Output: Hello from Outer Class

        // Static Nested Class

        // Create an instance of the static nested class (no need for outer class
        // instance)
        OuterClasss.StaticNestedClass staticNested = new OuterClasss.StaticNestedClass();

        // Call method of the static nested class
        staticNested.display(); // Output: Hello from Outer Class (static)

    }
}
