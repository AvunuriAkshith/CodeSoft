public class CurrencyConverter {

    public static double convert(double amount, String from, String to) {

        if (from.equals("USD") && to.equals("INR")) {
            return amount * 83.5;
        }

        else if (from.equals("INR") && to.equals("USD")) {
            return amount * 0.012;
        }

        else if (from.equals("USD") && to.equals("EUR")) {
            return amount * 0.88;
        }

        else if (from.equals("EUR") && to.equals("USD")) {
            return amount * 1.13;
        }

        else {
            return -1;
        }
    }
}