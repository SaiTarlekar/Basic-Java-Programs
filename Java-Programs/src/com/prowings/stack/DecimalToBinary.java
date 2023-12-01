package com.prowings.stack;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public DecimalToBinary() {
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Decimal Number : ");
		int number = scan.nextInt();
		
		Stack s = new Stack(String.valueOf(number).length()*10);
		int counter = 0;
		while(number > 0) {
			s.push(number%2);
			number = number/2;
			counter++;
		}
		
		for(int i=0; i<counter; i++) {
			System.out.print(s.pop()+ " ");
		}
	
	}
}
