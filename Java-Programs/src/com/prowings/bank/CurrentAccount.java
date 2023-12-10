package com.prowings.bank;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class CurrentAccount extends BankAccount {

	Scanner scan = new Scanner(System.in);
	private double initialBalance;
	private Customer customer;
	private int accNo;
	
	public CurrentAccount() {}
	
	public CurrentAccount(double initialBalance, Customer customer, int accNo) {
		super(initialBalance, customer, accNo);
	}

	@Override
	public void moneyWithdraw(double amount) {
	
		try {
			if(amount < 0)
				throw new IllegalArgumentException("Amount can not be in negative.");
			
			else if(amount > getBalance())
				throw new IllegalArgumentException("Withdrawing amount cannot be more than the balance.");
			
			else
				setBalance(getBalance() - amount); 
		}
		
		catch(RuntimeException e) {
			System.err.println("Error : " +e.getMessage());
		}
		finally {
			scan.close();
		}
		
	}

	@Override
	public void moneyDeposit(double amount) {
		try {
			if(amount < 0)
				throw new IllegalArgumentException("Amount cannot be in negative.");
			
			else
				setBalance(getBalance() + amount); 
		}
		catch(Exception e) {
			System.err.println("Error : " +e.getMessage());
		}
	}

}
