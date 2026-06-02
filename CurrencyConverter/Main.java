import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Currency Converter =====");

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        System.out.print("From Currency (USD/INR/EUR): ");
        String from = sc.next().toUpperCase();

        System.out.print("To Currency (USD/INR/EUR): ");
        String to = sc.next().toUpperCase();

        double result =
                CurrencyConverter.convert(
                        amount,
                        from,
                        to
                );

        if (result == -1) {
            System.out.println("Currency Pair Not Supported!");
        } else {
            System.out.println(
                    amount + " " + from +
                            " = " +
                            result + " " + to
            );
        }

        sc.close();
    }
}