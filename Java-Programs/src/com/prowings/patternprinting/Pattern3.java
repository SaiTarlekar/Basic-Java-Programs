package com.prowings.patternprinting;

import java.util.Scanner;

public class Pattern3 {

	private static Scanner scan = new Scanner(System.in);

	public Pattern3() {
	}

	public static void main(String[] args) {
		System.out.println("Enter Size : ");
		int size = scan.nextInt();

		for (int i = 1; i <= size; i++) {
			// Print spaces for each row
			for (int j = size; j > i; j--) {
				System.out.print("  ");
			}

			// Print ascending numbers
			for (int j = i; j >= 1; j--) {
				System.out.print(" " + j);
			}

			// Print descending numbers
			for (int j = 2; j <= i; j++) {
				System.out.print(" " + j);
			}

			System.out.println(); // Move to the next line
		}
	}

}
