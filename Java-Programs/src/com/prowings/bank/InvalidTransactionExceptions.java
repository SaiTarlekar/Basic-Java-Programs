package com.prowings.bank;

class InvalidWithdrawalExceptions extends Exception {

	public InvalidWithdrawalExceptions(String message) {
		super(message);
	}

}


class InsufficientBalanceExceptions extends Exception{
	
	public InsufficientBalanceExceptions(String message) {
		super(message);
	}
	

}