package com.prowings.interview;

public class StringLowerUpper {

	
	public static void main(String[] args) {
		String str = "Sai Tarlekar Sai Tarlekar";
		
		String lowercase = str.substring(0, str.length()/2).toLowerCase();
		String uppercase = str.substring(str.length()/2, str.length()).toUpperCase();

		System.out.println(lowercase + uppercase);

	}
}
