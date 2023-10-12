package com.prowings.bank;

public abstract class BankTransaction {

	private double balance;
	private TransactionLog transactionLog;

	public BankTransaction() {}

	public BankTransaction(double initialBalance) {
		this.balance = initialBalance;
		this.transactionLog = new TransactionLog();
	}

	public TransactionLog getTransactionLog() {
		return transactionLog;
	}

	protected double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

	public void moneyWithdraw(double amount) throws InvalidWithdrawalExceptions, InsufficientBalanceExceptions {};

	public void moneyDeposit(double amount) throws InsufficientBalanceExceptions {}

}