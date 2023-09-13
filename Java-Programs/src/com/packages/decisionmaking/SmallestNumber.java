package com.packages.decisionmaking;

import java.util.Scanner;

public class SmallestNumber {

	static Scanner scan = new Scanner(System.in);

	static void findSmallestNumber(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {

		if ((firstNumber == secondNumber) && (secondNumber == thirdNumber) && (secondNumber == fourthNumber)) {
			System.out.println("All three Numbers are Equal.");
		}

		
		else if ((firstNumber == secondNumber) && (secondNumber != thirdNumber)) {
			if (firstNumber > thirdNumber)
				System.out.println("First Number (" + firstNumber + ") & Second Number (" + secondNumber + ") "
						+ "are same and largest.");
			else
				System.out.println("Third Number (" + thirdNumber + ") is largest.");
		}

		else if ((secondNumber == thirdNumber) && (firstNumber != secondNumber)) {
			if (thirdNumber > firstNumber)
				System.out.println("Second Number (" + secondNumber + ") & Third Number (" + thirdNumber + ") "
						+ "are same and largest.");
			else
				System.out.println("First Number (" + firstNumber + ") is largest.");
		}

		else if ((firstNumber == thirdNumber) && (firstNumber != secondNumber)) {
			if (firstNumber > secondNumber)
				System.out.println("First Number (" + firstNumber + ") & Third Number (" + thirdNumber + ") "
						+ "are same and largest.");
			else
				System.out.println("Second Number (" + secondNumber + ") is largest.");
		}

		else {
			if (firstNumber > secondNumber) {
				if (firstNumber > thirdNumber)
					System.out.println("First Number is largest.");
				else
					System.out.println("Third Number is largest.");
			} else {
				if (secondNumber > thirdNumber)
					System.out.println("Second Number is largest.");
				else
					System.out.println("Third Number is largest.");
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter First Number : ");
		int firstNumber = scan.nextInt();
		System.out.println("Enter Second Number : ");
		int secondNumber = scan.nextInt();
		System.out.println("Enter Third Number : ");
		int thirdNumber = scan.nextInt();
		System.out.println("Enter Fourth Number : ");
		int fourthNumber = scan.nextInt();

//		System.out.println(+findLargestNumber(firstNumber, secondNumber, thirdNumber));
		findSmallestNumber(firstNumber, secondNumber, thirdNumber, fourthNumber);
	}
}
