package com.prowings.decisionmaking;

import java.util.Scanner;

public class ResultDecider {
	static Scanner scan = new Scanner(System.in);

	

	static void resultDecider(float marks) {
		if (marks >= 35 && marks <= 100)
			System.out.println("Pass");
		else if (marks >= 0 && marks < 35)
			System.out.println("Fail");
		else
			System.out.println("Incorrect Marks");

	}

	public static void main(String[] args) {
		System.out.println("Enter Marks : ");
		float marks = scan.nextFloat();
		resultDecider(marks);

	}
}
