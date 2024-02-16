/* Dylan G Barnes
Lesson Four Homework: Lottery game
CSC1060X04 Computer Science 1 
Monday, February 12th, 2024.
*/

import java.util.Scanner;

public class LessonFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("This program will calculate the payment for a given loan amount.");
            System.out.print("Enter the loan amount: ");
            double loanAmount = scanner.nextDouble();
            System.out.print("Enter the annual interest rate: ");
            double annualInterestRate = scanner.nextDouble();
            System.out.print("Enter the number of years to pay off the loan: ");
            int years = scanner.nextInt();

            double monthlyInterestRate = annualInterestRate / 100 / 12;
            int numberOfPayments = years * 12;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
            double totalPayment = monthlyPayment * numberOfPayments;

            System.out.println("Interest rate per period: " + monthlyInterestRate);
            System.out.println("Number of payments: " + numberOfPayments);
            System.out.println("Monthly payment: " + monthlyPayment);
            System.out.println("Total of all payments: " + totalPayment);

            System.out.println("\nPayment#\tRemaining Balance\tPrincipal\tInterest");
            double remainingBalance = loanAmount;
            for (int i = 1; i <= numberOfPayments; i++) {
                double interest = remainingBalance * monthlyInterestRate;
                double principal = monthlyPayment - interest;
                remainingBalance -= principal;
                if (remainingBalance < 0) {
                    principal += remainingBalance;
                    remainingBalance = 0;
                }
                System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i, remainingBalance, principal, interest);
                if (remainingBalance == 0) break;
            }

            System.out.println("\nWould you like to calculate another payment plan?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            if (choice == 2) {
                break;
            }
        }
        
        System.out.println("Thank you.");
        scanner.close();
    }
}