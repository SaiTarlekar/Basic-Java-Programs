package com.prowings.decisionmaking;

import java.util.Scanner;

public class SmallestNumber {

	static Scanner scan = new Scanner(System.in);

	static void findSmallestNumber(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
		boolean allEqual = (firstNumber == secondNumber) && (firstNumber == thirdNumber)
				&& (firstNumber == fourthNumber);
		boolean firstUnique = ((secondNumber == thirdNumber) && (secondNumber == fourthNumber))
				&& (secondNumber != firstNumber);
		boolean secondUnique = ((firstNumber == thirdNumber) && (firstNumber == fourthNumber))
				&& (firstNumber != secondNumber);
		boolean thirdUnique = ((firstNumber == secondNumber) && (firstNumber == fourthNumber))
				&& (firstNumber != thirdNumber);
		boolean fourthUnique = ((firstNumber == secondNumber) && (firstNumber == thirdNumber))
				&& (firstNumber != fourthNumber);

		boolean firstSmallest = (firstNumber < secondNumber) && (firstNumber < thirdNumber)
				&& (firstNumber < fourthNumber);
		boolean secondSmallest = (secondNumber < firstNumber) && (secondNumber < thirdNumber)
				&& (secondNumber < fourthNumber);
		boolean thirdSmallest = (thirdNumber < firstNumber) && (thirdNumber < secondNumber)
				&& (thirdNumber < fourthNumber);
		boolean fourthSmallest = (fourthNumber < firstNumber) && (fourthNumber < secondNumber)
				&& (fourthNumber < thirdNumber);

		if (allEqual)
			System.out.println("All numbers are same.");

		else if (firstUnique) {
			if (firstNumber < secondNumber)
				System.out.println("First Number is Smallest.");
			else
				System.out.println("Second, Third and Fourth Number are Smallest.");
		}

		else if (secondUnique) {
			if (secondNumber < firstNumber)
				System.out.println("Second Number is Smallest.");
			else
				System.out.println("First, Third and Fourth Number are Smallest.");
		}

		else if (thirdUnique) {
			if (thirdNumber < firstNumber)
				System.out.println("Third Number is Smallest.");
			else
				System.out.println("First, Second and Fourth Number are Smallest.");
		}

		else if (fourthUnique) {
			if (fourthNumber < firstNumber)
				System.out.println("Fourth Number is Smallest.");
			else
				System.out.println("First, Second and Third Number are Smallest.");
		}

		else if ((firstNumber == secondNumber) && (firstNumber != thirdNumber) && (firstNumber != fourthNumber)) {
			if ((firstNumber < thirdNumber) && (firstNumber < fourthNumber))
				System.out.println("First and Second Number are Smallest.");
			else {
				if (thirdNumber < fourthNumber)
					System.out.println("Third Number is Smallest");
				else
					System.out.println("Fourth Number is Smallest");
			}
		}

		else if ((firstNumber == thirdNumber) && (firstNumber != secondNumber) && (firstNumber != fourthNumber)) {
			if ((firstNumber < secondNumber) && (firstNumber < fourthNumber))
				System.out.println("First and Third Number are Smallest.");
			else {
				if (secondNumber < fourthNumber)
					System.out.println("Second Number is Smallest");
				else
					System.out.println("Fourth Number is Smallest");
			}
		}

		else if ((firstNumber == fourthNumber) && (firstNumber != secondNumber) && (firstNumber != thirdNumber)) {
			if ((firstNumber < secondNumber) && (firstNumber < thirdNumber))
				System.out.println("First and Fourth Number are Smallest.");
			else {
				if (secondNumber < thirdNumber)
					System.out.println("Second Number is Smallest");
				else
					System.out.println("Third Number is Smallest");
			}
		}

		else if ((secondNumber == thirdNumber) && (secondNumber != firstNumber) && (secondNumber != fourthNumber)) {
			if ((secondNumber < firstNumber) && (secondNumber < fourthNumber))
				System.out.println("Second and Third Number are Smallest.");
			else {
				if (firstNumber < fourthNumber)
					System.out.println("First Number is Smallest");
				else
					System.out.println("Fourth Number is Smallest");
			}
		}

		else if ((secondNumber == fourthNumber) && (secondNumber != firstNumber) && (secondNumber != thirdNumber)) {
			if ((secondNumber < firstNumber) && (secondNumber < thirdNumber))
				System.out.println("Second and Fourth Number are Smallest.");
			else {
				if (firstNumber < thirdNumber)
					System.out.println("First Number is Smallest");
				else
					System.out.println("Third Number is Smallest");
			}
		}

		else if ((thirdNumber == fourthNumber) && (thirdNumber != firstNumber) && (thirdNumber != secondNumber)) {
			if ((thirdNumber < firstNumber) && (thirdNumber < secondNumber))
				System.out.println("Third and Fourth Number are Smallest.");
			else {
				if (firstNumber < secondNumber)
					System.out.println("First Number is Smallest");
				else
					System.out.println("Second Number is Smallest");
			}
		}

		else if ((firstNumber != secondNumber) && (firstNumber != thirdNumber) && (firstNumber != fourthNumber)
				&& (secondNumber != thirdNumber) && (thirdNumber != fourthNumber)) {
			if (firstSmallest)
				System.out.println("First Smallest");
			else if (secondSmallest)
				System.out.println("Second Smallest");
			else if (thirdSmallest)
				System.out.println("Third Smallest");
			else if (fourthSmallest)
				System.out.println("Fourth Smallest");

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

		findSmallestNumber(firstNumber, secondNumber, thirdNumber, fourthNumber);
	}
}
