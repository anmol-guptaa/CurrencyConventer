package CurrencyConverter;

import java.util.HashMap;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("   Welcome to the Currency Converter!");

        // Define conversion rates using a HashMap
        HashMap<String, Double> rates = new HashMap<>();
        rates.put("USD_INR", 83.0); // 1 USD = 83 INR
        rates.put("INR_USD", 0.012); // 1 INR = 0.012 USD
        rates.put("USD_EUR", 0.94); // 1 USD = 0.94 EUR
        rates.put("EUR_USD", 1.06); // 1 EUR = 1.06 USD
        rates.put("INR_EUR", 0.011); // 1 INR = 0.011 EUR
        rates.put("EUR_INR", 89.0); // 1 EUR = 89 INR
        rates.put("USD_GBP", 0.80); // 1 USD = 0.80 GBP
        rates.put("GBP_USD", 1.25); // 1 GBP = 1.25 USD
        rates.put("USD_AUD", 1.50); // 1 USD = 1.50 AUD
        rates.put("AUD_USD", 0.67); // 1 AUD = 0.67 USD
        rates.put("GBP_INR", 104.0); // 1 GBP = 104 INR
        rates.put("INR_GBP", 0.0096); // 1 INR = 0.0096 GBP
        rates.put("AUD_INR", 55.0); // 1 AUD = 55 INR
        rates.put("INR_AUD", 0.018); // 1 INR = 0.018 AUD
        rates.put("EUR_GBP", 0.85); // 1 EUR = 0.85 GBP
        rates.put("GBP_EUR", 1.18); // 1 GBP = 1.18 EUR

        // Take user input for currency conversion
        Scanner sc = new Scanner(System.in);

        // Input: Source currency
        System.out.println("Enter the source currency code (e.g., USD, INR, EUR, GBP, AUD): ");
        String sourceCurrency = sc.nextLine().toUpperCase(); // Convert to uppercase

        // Input: Target currency
        System.out.println("Enter the target currency code (e.g., USD, INR, EUR, GBP, AUD): ");
        String targetCurrency = sc.nextLine().toUpperCase(); // Convert to uppercase

        // Input: Amount to convert
        System.out.println("Enter the amount to convert: ");
        double amount = sc.nextDouble();

        // Create the key to get conversion rate from the HashMap
        String conversionKey = sourceCurrency + "_" + targetCurrency;

        // Perform the conversion if the rate is available
        if (rates.containsKey(conversionKey)) {
            double conversionRate = rates.get(conversionKey);
            double convertedAmount = amount * conversionRate;
            System.out.printf("Converted Amount: %.2f %s%n", convertedAmount, targetCurrency);
        } else {
            System.out.println("Sorry, conversion for the selected currencies is not available.");
        }

        // Close the scanner
        sc.close();

        // Goodbye message
        System.out.println("\nThank you for using the Currency Converter!");
    }
}

