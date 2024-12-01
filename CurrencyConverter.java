package CurrencyConverter;

import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {
        public static void main(String[] args) {
            // Display a welcome message
            System.out.println("   Welcome to the Real-Time Currency Converter!");
            System.out.println("Convert currencies effortlessly using this program.\n");

            // Step 1: Define conversion rates using a HashMap
            HashMap<String, Double> rates = new HashMap<>();
            rates.put("USD_INR", 83.0); // 1 USD = 83 INR
            rates.put("INR_USD", 0.012); // 1 INR = 0.012 USD
            rates.put("USD_EUR", 0.94); // 1 USD = 0.94 EUR
            rates.put("EUR_USD", 1.06); // 1 EUR = 1.06 USD
            rates.put("INR_EUR", 0.011); // 1 INR = 0.011 EUR
            rates.put("EUR_INR", 89.0); // 1 EUR = 89 INR

            // Step 2: Define currency symbols
            HashMap<String, String> symbols = new HashMap<>();
            symbols.put("USD", "$");
            symbols.put("INR", "₹");
            symbols.put("EUR", "€");

            Scanner sc = new Scanner(System.in);
            char choice;

            do {
                // Input: Source currency
                System.out.println("Enter the source currency code (e.g., USD, INR, EUR): ");
                String sourceCurrency = sc.next().toUpperCase();

                // Input: Target currency
                System.out.println("Enter the target currency code (e.g., USD, INR, EUR): ");
                String targetCurrency = sc.next().toUpperCase();

                // Input: Amount to convert
                System.out.println("Enter the amount to convert: ");
                double amount = sc.nextDouble();

                // Step 3: Create a key to fetch conversion rate from the HashMap
                String conversionKey = sourceCurrency + "_" + targetCurrency;

                // Step 4: Perform the conversion
                if (rates.containsKey(conversionKey)) {
                    double conversionRate = rates.get(conversionKey);
                    double convertedAmount = amount * conversionRate;

                    // Fetch currency symbols
                    String sourceSymbol = symbols.getOrDefault(sourceCurrency, sourceCurrency);
                    String targetSymbol = symbols.getOrDefault(targetCurrency, targetCurrency);

                    // Display the result
                    System.out.printf("Converted Amount: %.2f %s (%s to %s)%n", convertedAmount, targetSymbol, sourceSymbol, targetSymbol);
                } else {
                    // Handle unsupported currencies
                    System.out.println("Sorry, conversion for the selected currencies is not available.");
                }

                // Ask the user if they want to perform another conversion
                System.out.println("Do you want to perform another conversion? (Y/N): ");
                choice = sc.next().toUpperCase().charAt(0);

            } while (choice == 'Y');

            // Goodbye message
            System.out.println("\nThank you for using the Currency Converter. Have a great day!");
            sc.close();
        }
}


