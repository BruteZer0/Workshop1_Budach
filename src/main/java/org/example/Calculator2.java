package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("CD Calculator");

        System.out.println("Deposit: ");

        double deposit = scanner.nextDouble();

        System.out.println("Your deposit is: " + deposit);

        System.out.println("Interest rate: ");

        double interest = scanner.nextDouble();

        System.out.println("Your interest rate is: " + interest + "%");

        System.out.println("Years: ");

        int years = scanner.nextInt();

        System.out.println("Your CD length is: " + years + " years");

        int days = years * 365;

        double interestRate = interest * .01;

        double interestDailyRate = interestRate / 365;

        double daysInYears = 365 * years;

        double fv1 = 1 + (interestRate / 365);

        double fv2 = Math.pow(fv1, 365 * years);

        double fv = deposit * fv2;

        System.out.println("Your CD ending balance is: $" + fv);

        double totalInterestEarned = fv - deposit;

        System.out.println("Your total interest earned is: $" + totalInterestEarned);

    }
}
