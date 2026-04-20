public class BankSystem {
    public static void main(String[] args) {
        // Polymorphism: parent reference pointing to child objects
        BankAccount savings = new SavingsAccount("Zainab", 1200.0);
        BankAccount current = new CurrentAccount("Ahmed", 800.0);

        System.out.println("=== Savings Account Demo ===");
        savings.display();
        savings.deposit(300.0);
        savings.withdraw(800.0);   // 1200 + 300 - 800 = 700 > 500
        savings.withdraw(300.0);   // would go below minimum
        //         savings.display();

        System.out.println("\n=== Current Account Demo ===");
        current.display();
        current.deposit(200.0);
        current.withdraw(900.0);   // 800 + 200 - 900 = 100
        current.withdraw(200.0);   // insufficient balance
        current.display();
    }
}