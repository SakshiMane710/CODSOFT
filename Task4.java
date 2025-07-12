import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base currency (USD / INR / EUR / GBP / JPY / CAD / AUD): ");
        String base = sc.next().toUpperCase();

        System.out.println("Enter target currency (USD / INR / EUR / GBP / JPY / CAD / AUD): ");
        String target = sc.next().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = sc.nextDouble();

        double rate = 1.0;

        if (base.equals("USD") && target.equals("INR")) {
            rate = 85.48;
        } else if (base.equals("INR") && target.equals("USD")) {
            rate = 0.012;
        } else if (base.equals("USD") && target.equals("EUR")) {
            rate = 0.85;
        } else if (base.equals("EUR") && target.equals("USD")) {
            rate = 1.18;
        } else if (base.equals("INR") && target.equals("EUR")) {
            rate = 0.0104;
        } else if (base.equals("EUR") && target.equals("INR")) {
            rate = 96.0;
        } else if (base.equals("USD") && target.equals("GBP")) {
            rate = 0.76;
        } else if (base.equals("GBP") && target.equals("USD")) {
            rate = 1.31;
        } else if (base.equals("USD") && target.equals("JPY")) {
            rate = 110.0;
        } else if (base.equals("JPY") && target.equals("USD")) {
            rate = 0.0091;
        } else if (base.equals("USD") && target.equals("CAD")) {
            rate = 1.34;
        } else if (base.equals("CAD") && target.equals("USD")) {
            rate = 0.75;
        } else if (base.equals("USD") && target.equals("AUD")) {
            rate = 1.49;
        } else if (base.equals("AUD") && target.equals("USD")) {
            rate = 0.67;
        } else if (base.equals(target)) {
            rate = 1.0;
        } else {
            System.out.println("Conversion not available or invalid input.");
            sc.close();
            return;
        }

        double converted = amount * rate;
        System.out.println(amount + " " + base + " = " + converted + " " + target);

        sc.close();
    }
}
