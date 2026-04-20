public class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 500.0;

    public SavingsAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Amount must be positive.");
            return;
        }

        double currentBalance = getBalance();
        if (currentBalance - amount < MINIMUM_BALANCE) {
            System.out.println("Withdrawal denied. Savings account must maintain a minimum balance of $" + MINIMUM_BALANCE);
            return;
        }

        setBalance(currentBalance - amount);
        System.out.println("Withdrawn $" + amount + " from Savings Account successfully.");
    }
}