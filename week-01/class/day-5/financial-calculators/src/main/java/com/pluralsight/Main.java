package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please choose the calculator you want to use! \n 1. Mortgage Calculator \n 2. Future Value \n 3. Present value");
        System.out.print("Option: ");
        int option = scan.nextInt();

        if (option == 1) {
            morgtageCalculator();
        } else if (option == 2) {
            //futureValue();
        } else if (option == 3) {
            //presentValue();
        } else {
            System.out.println("Option invalid: RESTART;");
        }
    }

    public static void morgtageCalculator() {
        /**
         * Calculator 1: A mortgage calculator - it is used to calculate out
         * how much a monthly payment for a loan would be (minus any
         * insurance or taxes), as well as how much interest you would pay
         * over the life of the loan.
         *
         * It would accept the principal, interest rate, and loan length
         * from the user
         *
         * It would display the expected monthly payment and total
         * interest paid
         *
         * Example: A $53,000 loan at 7.625% interest for 15 years would
         * have a $495.09/mo payment with a total interest of $36,115.99
         * This calculator would use a compounded interest formula.
         * M = P × (i * (1 + i )^n / ( (1 + i)^n ) - 1)
         *
         * Monthly Payment (M) =
         *  Principal (P): This is the total amount of the loan.
         *  Annual Interest Rate (r): The nominal annual interest rate in decimal form. (e.g. 7.625% = 0.07625)
         *
         *  Loan Term in Years (y): How many years the loan lasts.
         *
         *  Number of Monthly Payments (n): This is 12 × y (Because there are 12 monthly payments per year.)
         *
         *  Monthly Interest Rate (i): This is the annual interest rate divided by 12, i.e. r/12
         *
         * Total Interest = (M×n)−P
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Loan Amount: ");
        double loanAmount = scan.nextDouble(); //Principal (p)

        System.out.print("Enter Interest Rate: ");
        double interestRate = scan.nextDouble() / 100; //interest rate (r)

        System.out.print("Enter Loan Length (in years): ");
        int loanLengthInYears = scan.nextInt(); //loan length in years (y)

        int numberOfMonthlyPayments = 12 * loanLengthInYears; //Number of Monthly Payments (n)

        double monthlyInterestRate = interestRate / 12; //Monthly Interest Rate (i)

        //M = P × (i * (1 + i )^n / ( (1 + i)^n ) - 1)
        double monthlyPayment = loanAmount *
                (
                        monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments)
                                /
                                (
                                        Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments) - 1
                                )
                );

        double totalInterest = (monthlyPayment * numberOfMonthlyPayments) - loanAmount;

        System.out.printf("Monthly Payment: $%.2f, Total Interest: $%.2f", monthlyPayment, totalInterest);
    }

}
