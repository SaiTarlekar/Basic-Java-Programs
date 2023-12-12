package com.prowings.cloning;


class Bank{
	
	Bank(){}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}


class Employee extends Bank{
	
	public Employee() {}	

}




public class TestCloning {


	public static void main(String[] args) {
		
		Bank b1 = new Bank();
	}

}
