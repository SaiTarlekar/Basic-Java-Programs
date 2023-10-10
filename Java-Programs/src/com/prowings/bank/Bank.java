package com.prowings.bank;

import java.util.Scanner;

public class Bank {
	private static Scanner scan = new Scanner(System.in);
	protected static double savingsMinBalance = 1000;
	protected static double currentMinBalance = 5000;

	public Bank() {
	}

	public static void main(String[] args) {

		double savingsBalance = 0, currentBalance = 0;

		try {
			System.out.println("Please enter Opening balance for Savings account \n(Minimum balance must be 1000): ");

			savingsBalance = scan.nextDouble();
			if (savingsBalance < savingsMinBalance)
				throw new IllegalArgumentException("Please try to enter above minimum balance.");

			scan.nextLine();
			System.out.println("Please enter Opening balance for Current account \n(Minimum balance must be 5000): ");
			currentBalance = scan.nextDouble();
			if (currentBalance < currentMinBalance)
				throw new IllegalArgumentException("Please try to enter above minimum balance.");

		} catch (IllegalArgumentException e) {
			System.err.println("Error : " + e.getMessage());
			System.exit(1);
		}

		SavingsAccount savingsAccount = new SavingsAccount(savingsBalance);
		CurrentAccount currentAccount = new CurrentAccount(currentBalance);

		
		while(true) {
			System.out.println("\n\nChoose option to perform any transaction in your account : ");
			System.out.println("1) Deposit Money in Savings Account." + "\n2) Withdraw Money from Saving Account."
					+ "\n3) Deposit Money in Current Account." + "\n4) Withdraw Money from Current Account."
					+ "\n5) Check Balance of Saving Account." + "\n6) Check Balance of Current Account." + "\n7) Exit.\n");
			int choice = scan.nextInt();
			double amount = 0;
			switch (choice) {
			case 1:
				System.out.println("Enter Amount to deposit in Savings Account : ");
				amount = scan.nextDouble();
				try {
					savingsAccount.moneyDeposit(amount);
					break;
				} catch (InsufficientBalanceExceptions e) {
					System.err.println("Error : " + e.getMessage());
					System.exit(1);
				}

			case 2:
				System.out.println("Enter Amount to Withdraw from Savings Account : ");
				amount = scan.nextDouble();
				try {
					savingsAccount.moneyWithdraw(amount);
					break;
				} catch (InvalidWithdrawalExceptions | InsufficientBalanceExceptions e) {
					System.err.println("Error : " + e.getMessage());
					System.exit(1);
				}

			case 3:
				System.out.println("Enter Amount to deposit in Current Account : ");
				amount = scan.nextDouble();
				try {
					currentAccount.moneyDeposit(amount);
					break;
				} catch (InsufficientBalanceExceptions e) {
					System.err.println("Error : " + e.getMessage());
					System.exit(1);
				}

			case 4:
				System.out.println("Enter Amount to Withdraw from Current Account : ");
				amount = scan.nextDouble();
				try {
					currentAccount.moneyWithdraw(amount);
					break;
				} catch (InvalidWithdrawalExceptions | InsufficientBalanceExceptions e) {
					System.err.println("Error : " + e.getMessage());
					System.exit(1);
				}

			case 5:
				System.out.println("Savings Account Balance : "+savingsAccount.getBalance()); 
				break;
			case 6:
				
				System.out.println("Current Account Balance : "+currentAccount.getBalance());
				break;
			case 7:
				System.out.println("Thank you for visiting our Bank.");
				return;
			default:
				System.out.println("Invalid Choice. Please enter a valid option.");
				break;
			}
		}
	}

}
