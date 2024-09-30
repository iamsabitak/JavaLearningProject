package Day21;

// Defining the interface
interface Animal {
    void eat();

    void makeSound();
}

// Implementing the Animal interface in Dog class
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("The dog eats dog food.");
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Implementing the Animal interface in Cat class
class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("The cat eats cat food.");
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Defining the Payment interface
interface Payment {
    void makePayment(double amount); // Abstract method for payment
}

// Defining the Payable interface
interface Payable {
    void pay(); // Abstract method for paying
}

// Defining the Refundable interface
interface Refundable {
    void refund(); // Abstract method for refunding
}

// Implementing the Payment interface in CreditCardPayment class
class CreditCardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

// Implementing the Payment interface in PayPalPayment class
class PayPalPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

// Implementing the Payable and Refundable interfaces in Transaction class
class Transaction implements Payable, Refundable {
    private Payment payment;

    public Transaction(Payment payment) {
        this.payment = payment;
    }

    public void processPayment(double amount) {
        payment.makePayment(amount); // Loose coupling
    }

    @Override
    public void pay() {
        System.out.println("Processing payment...");
    }

    @Override
    public void refund() {
        System.out.println("Refund processed.");
    }
}

public class InterfacesExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.eat();
        myDog.makeSound();

        Animal myCat = new Cat();
        myCat.eat();
        myCat.makeSound();


        Payment payment1 = new CreditCardPayment(); // Polymorphism
        Payment payment2 = new PayPalPayment(); // Polymorphism

        Transaction transaction1 = new Transaction(payment1);
        transaction1.pay();
        transaction1.processPayment(100.0); // Reusability
        
        Transaction transaction2 = new Transaction(payment2);
        transaction2.pay();
        transaction2.processPayment(150.0); // Reusability
        
        transaction1.refund(); // Refund example
        transaction2.refund(); // Refund example
    }

}

