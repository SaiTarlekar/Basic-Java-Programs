package com.packages.decisionmaking;

import java.util.Scanner;

public class LargestNumber {
	static Scanner scan = new Scanner(System.in);

	static void findLargestNumber(int firstNumber, int secondNumber, int thirdNumber) {

		boolean equalNumbers = (firstNumber == secondNumber) && (secondNumber == thirdNumber);
		
		boolean firstUnique = (secondNumber == thirdNumber) && (secondNumber != firstNumber);
		boolean secondUnique = (firstNumber == thirdNumber) && (firstNumber != secondNumber);
		boolean thirdUnique = (firstNumber == secondNumber) && (secondNumber != thirdNumber);
		
		
		
		if (equalNumbers) {
			System.out.println("All three Numbers are Equal.");
		}

		else if (thirdUnique) {
			if (firstNumber > thirdNumber)
				System.out.println("First Number (" + firstNumber + ") & Second Number (" + secondNumber + ") "
						+ "are same and largest.");
			else
				System.out.println("Third Number (" + thirdNumber + ") is largest.");
		}

		else if (firstUnique) {
			if (thirdNumber > firstNumber)
				System.out.println("Second Number (" + secondNumber + ") & Third Number (" + thirdNumber + ") "
						+ "are same and largest.");
			else
				System.out.println("First Number (" + firstNumber + ") is largest.");
		}

		else if (secondUnique) {
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

//		System.out.println(+findLargestNumber(firstNumber, secondNumber, thirdNumber));
		findLargestNumber(firstNumber, secondNumber, thirdNumber);
	}
}

/*
 * if(firstNumber > secondNumber) { if(firstNumber > thirdNumber)
 * System.out.println("First Number is largest."); else
 * System.out.println("Third Number is largest."); } else { if(secondNumber >
 * thirdNumber) System.out.println("Second Number is largest."); else
 * System.out.println("Third Number is largest."); }
 * 
 * 
 * 
 * return (firstNumber > secondNumber) ? ((firstNumber > thirdNumber) ?
 * firstNumber : thirdNumber) : ((secondNumber > thirdNumber) ? secondNumber :
 * thirdNumber);
 */



/*

if ((firstNumber == secondNumber) && (secondNumber == thirdNumber)) {
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

*/