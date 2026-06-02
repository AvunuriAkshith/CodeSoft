public class Main {

    public static void main(String[] args) {

        // Initial Balance
        BankAccount userAccount = new BankAccount(5000);

        // Create ATM Object
        ATM atm = new ATM(userAccount);

        // Start ATM
        atm.showMenu();
    }
}