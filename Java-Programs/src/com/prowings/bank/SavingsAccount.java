package com.prowings.bank;

public class SavingsAccount extends BankAccount {

	private double initialBalance;
	private Customer customer;
	private int accNo;
	
	public SavingsAccount() {}

	public SavingsAccount(double initialBalance, Customer customer, int accNo) {
		super(initialBalance, customer, accNo);
	}

	@Override
	public void moneyWithdraw(double amount) {
		try {
			if(amount < 0)
				throw new IllegalArgumentException("Amount can not be in negative.");
			
			else if(amount < getBalance())
				throw new IllegalArgumentException("Withdrawing amount cannot be less than the balance.");
			
			else
				setBalance(getBalance() - amount); 
		}
		
		catch(Exception e) {
			System.err.println("Error : " +e.getMessage());
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
