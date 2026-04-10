package org.example;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("------Annuity calculator-------");

        System.out.println("Monthly payout: ");

        double monthlyPayout = scanner.nextDouble();

        System.out.println("Your monthly payout is: $" + monthlyPayout);

        System.out.println("Interest rate: ");

        double interest = scanner.nextDouble();

        System.out.println("Your interest rate is: " + interest + "%");

        System.out.println("Years: ");

        double years = scanner.nextDouble();

        System.out.println("Your length is: " + years + " years");

        double periods = years * 12;

        double periodicInterestRate = (interest * .01) / 12;

        double pv1 = 1 + periodicInterestRate;

        double pv2 = Math.pow(pv1,-periods);

        double pv3 = 1 - pv2;

        double pv4 = pv3 / periodicInterestRate;

        double pv = monthlyPayout * pv4;

        System.out.println("You need to invest today: $" + pv);


    }
}
