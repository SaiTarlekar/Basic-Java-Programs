package com.prowings.bank;

public class CurrentAccount extends BankTransaction{

	public CurrentAccount() {}
	
	
	public CurrentAccount(double initialBalance) {
		super(initialBalance);
	}

	@Override
	public void moneyWithdraw(double amount) throws InvalidWithdrawalExceptions, InsufficientBalanceExceptions {
		if(amount < 0)
			throw new InsufficientBalanceExceptions("Balance is less than 0. Error while withdrawing money.");
		
		else if(amount > getBalance())
			throw new InvalidWithdrawalExceptions("You cannot withdraw money more than your balance.");
		
		else {
			setBalance(getBalance() - amount);
			System.out.println("Rs."+amount+" withdrawn successfully.");	
			if(getBalance() < Bank.currentMinBalance)
		        System.out.println("\u001B[33m" + "Warning: Balance is below minimum. Try to maintain min\u001B[0m");
			System.out.println("Current Account Balance : "+getBalance());
		}
	}

	@Override
	public void moneyDeposit(double amount) throws InsufficientBalanceExceptions {
		if(amount < 0)
			throw new InsufficientBalanceExceptions("Balance is less than 0. Error while withdrawing money.");
		else {
			setBalance(getBalance() + amount);
			System.out.println("Rs."+amount+" Deposited Successfully.");
			System.out.println("Current Account Balance : "+getBalance());
		}
	}
}
