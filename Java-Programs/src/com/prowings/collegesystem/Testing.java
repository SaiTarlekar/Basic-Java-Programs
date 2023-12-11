package com.prowings.collegesystem;

public class Testing {

	public static void main(String[] args) {
		String name = "Om"; 
		if((name.length() >= 2) && (name.matches("[a-zA-Z]+")) ) {
			System.out.println(true);
		}
		else
			System.out.println(false);
	}

}
