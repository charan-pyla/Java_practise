import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double usdRate = 83.0;
        double eurRate = 90.0;
        double gbpRate = 105.0;

        while (true) {
            System.out.println("\n=== Currency Converter ===");
            System.out.println("1. INR to USD");
            System.out.println("2. INR to EUR");
            System.out.println("3. INR to GBP");
            System.out.println("4. USD to INR");
            System.out.println("5. EUR to INR");
            System.out.println("6. GBP to INR");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            if (choice == 7) {
                System.out.println("Exiting program...");
                break;
            }

            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            double result;

            switch (choice) {
                case 1:
                    result = amount / usdRate;
                    System.out.printf("USD: %.2f\n", result);
                    break;

                case 2:
                    result = amount / eurRate;
                    System.out.printf("EUR: %.2f\n", result);
                    break;

                case 3:
                    result = amount / gbpRate;
                    System.out.printf("GBP: %.2f\n", result);
                    break;

                case 4:
                    result = amount * usdRate;
                    System.out.printf("INR: %.2f\n", result);
                    break;

                case 5:
                    result = amount * eurRate;
                    System.out.printf("INR: %.2f\n", result);
                    break;

                case 6:
                    result = amount * gbpRate;
                    System.out.printf("INR: %.2f\n", result);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}