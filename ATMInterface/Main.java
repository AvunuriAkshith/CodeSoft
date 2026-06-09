public class Main {

    public static void main(String[] args) {

        BankAccount userAccount = new BankAccount(5000);

        new ATMGUI(userAccount);
    }
}