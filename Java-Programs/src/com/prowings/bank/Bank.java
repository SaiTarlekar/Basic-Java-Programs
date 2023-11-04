package com.prowings.bank;

import java.util.Scanner;

public class Bank {

	
	final double SAVINGS_MIN_BALANCE = 1000;
	final double CURRENT_MIN_BALANCE = 10000;
	static final Scanner scan = new Scanner(System.in);
	
//	No-Arg Constructor
	public Bank() {}

	
	public static Customer newCustomer() {
		System.out.println("Enter Name : ");
		String custName = scan.nextLine();
		
		System.out.println("Enter Current Address : ");
		String custCurrentAdd = scan.nextLine();
		
		System.out.println("Enter Permanent Address (Same as Above) : ");
		String custPermAdd = scan.nextLine();
		
		if (custPermAdd.equalsIgnoreCase("Same as Above")) {
			custPermAdd = custCurrentAdd;
		}
		
		Address custAddress = new Address(custCurrentAdd, custPermAdd);
		
		System.out.println("Enter Phone No. : ");
		long custPhoneNo = scan.nextLong();
		
		System.out.println("Enter Alternative Phone No. : ");
		long custAlternativeNo = scan.nextLong();
		
		Phone custPhone = new Phone(custCurrentAdd, custPermAdd);
		
		System.out.println("Enter Age : ");
		int age = scan.nextInt();
		
		System.out.println("Enter Gender : ");
		String gender  = scan.next();
		char custGender = gender.charAt(0);
		
		
		return  new Customer(custName, custAddress, custPhone, age, custGender);
	}

	public static BankAccount initialBalanceVerification(double amount) {
		
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println("__________________Welcome__________________");
		
		System.out.println("\nPlease Complete our Customer Information Form to Open New Account ");
		Customer customer1 = newCustomer();
		
		
		
		System.out.println("Creating Current Account....");
		System.out.println();
		
		
	}

	
	
	
}
