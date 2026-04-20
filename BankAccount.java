public abstract class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // encapsulation
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Protected setter so subclasses can update balance safely
    protected void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    // Concrete method - same for all accounts
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount. Amount must be positive.");
        }
    }

    // Abstract method - must be implemented by subclasses 
    public abstract void withdraw(double amount);

    // Concrete method - same for all accounts
    public void display() {
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Current Balance: $" + getBalance());
    }
}