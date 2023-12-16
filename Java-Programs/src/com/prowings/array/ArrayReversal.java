package com.prowings.array;

import java.util.Scanner;

public class ArrayReversal {


	private static Scanner scan = new Scanner(System.in);
	
	public ArrayReversal() {
	}
	
	static int[] arrayReversal(int[] array) {
		
		int[] reversedArray = new int[array.length];
		int j=array.length-1;
		for(int i=0; i<array.length; i++) {
			reversedArray[j] = array[i];
			j--;
		}
		return reversedArray;
	}

	public static void main(String[] args) {
		System.out.println("Enter Size of Array : ");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		System.out.println("Enter Numbers : ");
		
		for(int i=0; i<size; i++) {
			System.out.print("array[" +(i+1)+"] : ");
			array[i] = scan.nextInt();
		}
		
		int[] reversedArray = arrayReversal(array);
		System.out.println("Reversed Array : ");
		for(int n:reversedArray) {
			System.out.print(n+ " ");
		}
	}

}
