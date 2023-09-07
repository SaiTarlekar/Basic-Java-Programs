package com.packages.decisionmaking;

import java.util.Scanner;

public class NumberComparison {
	static void checkNumberPositivity(int number1, int number2) {
		if (number1 > number2)
			System.out.println("Number1 is Greater.");
		else if(number1 == number2)
			System.out.println("Numbers are equal");
		else
			System.out.print("Number2 is Greater");
	}
	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int number1 = scan.nextInt();
		
		System.out.println("Enter Second Number : ");
		int number2 = scan.nextInt();
		checkNumberPositivity(number1, number2);
		
	}
}
