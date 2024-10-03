
# Loan Management System

This Java-based Loan Management System provides a graphical user interface for calculating loan payments and total amounts to be paid. It uses Swing for the GUI components.

## Features

1. Calculate total amount to be paid for a loan
2. Calculate monthly payment amount
3. User-friendly graphical interface

## How It Works

The system is built using Java Swing and consists of a single class `Loan` with the following components:

### GUI Components

- JFrame: The main window of the application
- JPanel: A container for other components, set with a green background
- JLabels: For displaying text like "LOAN AMOUNT", "LOAN PERIOD", etc.
- JTextFields: For user input and displaying results
- JButtons: For triggering calculations

### Key Concepts

1. **Loan Amount**: The principal amount of the loan.
2. **Loan Period**: The duration of the loan, typically in years.
3. **Interest Rate**: Annual interest rate as a percentage.
4. **Processing Fee**: A one-time fee added to the loan amount.

### Calculations

1. **Total Amount to be Paid**:
   - Formula: `Total = Principal + (Principal * Period * Interest Rate) + Processing Fee`
   - The interest rate is converted from a percentage to a decimal (divided by 100).

2. **Monthly Payment**:
   - Uses the formula for Equated Monthly Installment (EMI):
     ```
     EMI = [P * r * (1 + r)^n] / [(1 + r)^n - 1]
     ```
     Where:
     - P = Principal + Processing Fee
     - r = Monthly Interest Rate (Annual Rate / 12)
     - n = Total Number of Months (Years * 12)

### Event Handling

The system uses ActionListeners on the buttons to perform calculations when clicked:

1. When "CALCULATE TOTAL AMOUNT TO BE PAID" is clicked, it calculates the total loan amount.
2. When "CALCULATE AMOUNT TO BE PAID PER MONTH" is clicked, it calculates the monthly payment.

## Usage

1. Run the `Loan` class.
2. Enter the loan details in the provided text fields:
   - Loan Amount
   - Loan Period (in years)
   - Interest Rate (as a percentage)
   - Processing Fee
3. Click the respective buttons to calculate total amount or monthly payments.
4. Results will be displayed in the corresponding text fields.

## Note

This system provides a basic interface for loan calculations. For production use, consider adding input validation, error handling, and more comprehensive financial calculations.

