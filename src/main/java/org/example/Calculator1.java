package org.example;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Title
        System.out.println("Mortgage Calculator");

        //User input
        System.out.println("Principal amount:");

        //Principal variable
        double principal = scanner.nextFloat();

        System.out.println("Principal amount is: $" + principal);

        System.out.println("Yearly interest rate:");

        double interestRate = scanner.nextFloat();

        System.out.println("Interest rate is: " + interestRate + "%");

        System.out.println("Loan length in years :");

        int loanLength = scanner.nextInt();

        System.out.println("Loan length is: " + loanLength + " years");

        double monthlyInterest = (interestRate * .01) / 12;

        double monthlyTerms = 12 * loanLength;

        double monthlyInterestCalc = Math.pow(1 + monthlyInterest, monthlyTerms);

        double monthlyPayment1 = (monthlyInterest * monthlyInterestCalc) / (monthlyInterestCalc
                - 1);

        double monthlyPaymentAnswer = principal * monthlyPayment1;

        System.out.println("Your monthly payment is: $" + monthlyPaymentAnswer);

        double totalInterest = (monthlyPaymentAnswer * monthlyTerms) - principal;

        System.out.println("Total interest payment is: $" + totalInterest);
    }
}
