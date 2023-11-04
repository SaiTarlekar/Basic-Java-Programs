package com.prowings.bank;

abstract class BankAccount {

	
	private double balance;
	private Customer customer;
	private int accNo;
	
	
	public BankAccount() {}

	
	public BankAccount(double balance, Customer customer, int accNo) {
		super();
		this.balance = balance;
		this.customer = customer;
		this.accNo = accNo;
	}


	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public abstract void moneyWithdraw(double amount);
	public abstract void moneyDeposit(double amount);
	
	public void showAccountDetails() {
		System.out.println(customer);
		System.out.println("Account Number : " +accNo);
		System.out.println("Balance : " +balance);
	}
	
	

}
