public class CurrentAccount extends BankAccount {

    public CurrentAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Amount must be positive.");
            return;
        }

        double currentBalance = getBalance();
        if (currentBalance < amount) {
            System.out.println("Insufficient balance for withdrawal.");
            return;
        }

        setBalance(currentBalance - amount);
        System.out.println("Withdrawn $" + amount + " from Current Account successfully.");
    }
}