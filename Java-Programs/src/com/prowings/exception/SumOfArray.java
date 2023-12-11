package com.prowings.exception;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		int sum=0;
		
		System.out.println("Start Entering Numbers : ");
		
		try {
			while(scan.hasNext()) {
				String num = scan.next();
				if(num.equalsIgnoreCase("done"))
					break;
				else if(num.matches("[0-9]+"))
					sum += Integer.parseInt(num);
				else
					throw new IllegalArgumentException("Invalid Input.");
			}
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		finally {
			scan.close();
		}
		
		
		System.out.println("Sum = " +sum);
		
	}

}
