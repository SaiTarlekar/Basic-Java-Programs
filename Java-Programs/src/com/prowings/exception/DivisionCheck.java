//	Write a Java program that takes two integers as input from the user 
//	and calculates their division. Handle the case where the user might 
//	input non-integer values or attempt to divide by zero.

package com.prowings.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class DivisionCheck {

	public DivisionCheck() {}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("Enter first number : ");
//		int num1 = scan.nextInt();
//		
//		System.out.print("Enter second number : ");
//		int num2 = scan.nextInt();
		
		System.out.println("Result : " +divide(10, 0));
		
	}

	public static int divide(int num1, int num2){

		int result = 0;
		try {
//			result = (num1 / num2);
			throw new ArithmeticException();
		}
		catch(ArithmeticException e) {
			System.out.println("Message : " +e.getMessage() + "\nCause : " +e.getCause());
			return result;
		}
		finally {
			System.out.println("Clean up");
		}
		
		
		
	}

}
