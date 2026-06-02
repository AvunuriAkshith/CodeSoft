public class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
           balance += amount;
            System.out.println("Successfully Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid Deposit Amount!");
        }
           }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
        } else {
            balance -= amount;
            System.out.println("Successfully Withdrawn: ₹" + amount);
        }
    }

    // Check Balance Method
    public void checkBalance() {
        System.out.println("Current Balance: ₹" +balance);
    }
}