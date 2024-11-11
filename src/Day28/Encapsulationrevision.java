package Day28;

class BankAccount {
    private String accountHolderName;
    private double balance;
    protected String accountType;
    public static int totalAccounts = 0;

    public BankAccount(String accountHolderName, double initialDeposit, String accountType) {
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
        this.accountType = accountType;
        totalAccounts++;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    protected void displayAccountType() {
        System.out.println("Account Type: " + accountType);
    }
}

public class Encapsulationrevision {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", 1000, "Savings");
        BankAccount account2 = new BankAccount("Bob", 500, "Checking");

        System.out.println("Account Holder: " + account1.getAccountHolderName());
        System.out.println("Balance: " + account1.getBalance());

        account1.deposit(200);
        account1.withdraw(300);

        account1.displayAccountType();

        System.out.println("Total accounts created: " + BankAccount.getTotalAccounts());
    }
}
