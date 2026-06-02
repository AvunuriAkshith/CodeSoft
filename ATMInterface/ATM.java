import java.util.Scanner;

public  class ATM{

    private BankAccount account;
    private Scanner scanner;

    //Constructor
    public ATM(BankAccount account){
        this.account = account;
        scanner = new Scanner(System.in);
    }

    //ATM Menu
    public void showMenu(){
        int choice;
        do{
            System.out.println("\n======ATM Menu=======");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");

            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter Deposit Amount: ₹");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case  3:
                    System.out.println("Enter Withdraw Amount: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank You for using ATM!");
                    break;
                default:
                    System.out.println("Invalid Choice! Try Again.");

            }
        } while (choice != 4);
    }
}