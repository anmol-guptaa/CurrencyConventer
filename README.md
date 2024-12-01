# Currency Converter

## Overview

This *Currency Converter* allows users to convert money from one currency to another (e.g., USD to INR, EUR to USD) based on real-time exchange rates. The program works on the command line and supports multiple currencies like USD, INR, EUR, GBP, and AUD.

## Features

- Convert between different currencies like USD, INR, EUR, GBP, and AUD.
- Enter the source currency, target currency, and the amount to convert.
- Get the converted amount instantly.
- Works on the command line with easy-to-follow instructions.

## Supported Currencies

- *USD* - United States Dollar
- *INR* - Indian Rupee
- *EUR* - Euro
- *GBP* - British Pound
- *AUD* - Australian Dollar

## Example

Enter the source currency code (e.g., USD, INR, EUR, GBP, AUD): USD
<br/>
Enter the target currency code (e.g., USD, INR, EUR, GBP, AUD): INR
<br>
Enter the amount to convert: <b>100</b>
<br/>
Converted Amount:<b> 8300.00 ₹ ($ to ₹)</b>


## How It Works

1. The program uses a *HashMap* to store conversion rates for different currencies.
2. The user inputs the source currency, target currency, and amount to be converted.
3. The program checks if a conversion rate exists for the selected currencies.
4. If available, it performs the conversion and shows the result.