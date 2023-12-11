//	Write a Java program that takes two integers as input from the user 
//	and calculates their division. Handle the case where the user might 
//	input non-integer values or attempt to divide by zero.

package com.prowings.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class DivisionCheck {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number : ");
		int num1 = validate(scan.nextInt());

		System.out.println("Enter second number : ");
		int num2 = validate(scan.nextInt());

		System.out.println(num1 + "/" + num2 + " = " + divide(num1, num2));

	}

	public static int divide(int num1, int num2) {
		return num1 / num2;
	}

	public static int validate(int num) {
		try {
			if (num > 0)
				return num;
			else
				throw new IllegalArgumentException("Please enter valid integer values.");

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			System.exit(1);
			return -1;
		}
	}
}
