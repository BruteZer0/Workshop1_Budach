package org.example;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Title
        System.out.println("Mortgage Calculator");

        //User input
        System.out.println("Principal Amount:");

        //Principal variable
        float principal = scanner.nextFloat();

        System.out.println("Principal amount is: $" + principal);

        System.out.println("Interest rate:");

        float interestRate = scanner.nextFloat();

        System.out.println("Interest rate is: " + interestRate + "%");

        System.out.println("Loan length:");

        float loanLength = scanner.nextFloat();

        System.out.println("Loan length is: " + loanLength + " months");


    }
}
