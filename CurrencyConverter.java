package CurrencyConverter;

import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {
     public static void main(String[] args) {
            // Display a welcome message
         System.out.println("   Welcome to the Enhanced Currency Converter!");
         System.out.println("Convert currencies effortlessly using this program.\n");

            // Step 1: Define conversion rates using a HashMap
            HashMap<String, Double> rates = new HashMap<>();
            rates.put("USD_INR", 83.0);
            rates.put("INR_USD", 0.012);
            rates.put("USD_EUR", 0.94);
            rates.put("EUR_USD", 1.06);
            rates.put("USD_GBP", 0.78);
            rates.put("GBP_USD", 1.28);
            rates.put("USD_JPY", 146.0);
            rates.put("JPY_USD", 0.0068);
            rates.put("INR_EUR", 0.011);
            rates.put("EUR_INR", 89.0);
            rates.put("INR_GBP", 0.0095);
            rates.put("GBP_INR", 105.0);
            rates.put("INR_JPY", 1.75);
            rates.put("JPY_INR", 0.57);
            rates.put("EUR_GBP", 0.83);
            rates.put("GBP_EUR", 1.21);
            rates.put("EUR_JPY", 155.0);
            rates.put("JPY_EUR", 0.0065);
            rates.put("GBP_JPY", 186.0);
            rates.put("JPY_GBP", 0.0054);

            // Step 2: Define currency symbols
            HashMap<String, String> symbols = new HashMap<>();
            symbols.put("USD", "$");
            symbols.put("INR", "₹");
            symbols.put("EUR", "€");
            symbols.put("GBP", "£");
            symbols.put("JPY", "¥");

            Scanner sc = new Scanner(System.in);
            char choice;

            do {
                // Input: Source currency
                System.out.println("Enter the source currency code (USD, INR, EUR, GBP, JPY): ");
                String sourceCurrency = sc.next().toUpperCase();

                // Input: Target currency
                System.out.println("Enter the target currency code (USD, INR, EUR, GBP, JPY): ");
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
            System.out.println("\nThank you for using the Enhanced Currency Converter. Have a great day!");
            sc.close();
     }
}


