package com.prowings.decisionmaking;
import java.util.Scanner;
public class NumberPositivityChecker {

	static void checkNumberPositivity(int num) {
		if (num > 0)
			System.out.println("Number is Positive.");
		else if(num < 0)
			System.out.println("Number is Negative");
		else
			System.out.print("Number is Zero");
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = scan.nextInt();
		checkNumberPositivity(num);
		
	}
}
