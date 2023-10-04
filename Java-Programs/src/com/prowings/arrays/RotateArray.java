// Rotate an array of n elements to the right by k steps.
package com.prowings.arrays;

import java.util.Scanner;

public class RotateArray {
	private static Scanner scan = new Scanner(System.in);
	public RotateArray() {}

	private static int[] rotateArray(int[] nums, int k, int size) {
		int[] rotatedArray = new int[size];
		
//		for(int i=0; i<size; i++) {
//			for(int j=k; j<size; j++) {
//				rotatedArray[j] = nums[i];
//				if(k == size-1)
//					j=0;
//				
//			}
//		}
		
		
		
		
		
		
		return rotatedArray;
	}

	
	public static void main(String[] args) {
		System.out.println("Enter Size of Array : ");
		int size = scan.nextInt();

		int[] nums = new int[size];
		System.out.println("Enter Numbers : ");

		for (int i = 0; i < size; i++) {
			System.out.print("nums[" + (i + 1) + "] : ");
			nums[i] = scan.nextInt();
		}
	
		System.out.println("Enter value to rotate the array : ");
		int k = scan.nextInt();
		
		
		
		int[] result = rotateArray(nums, k, size);
		for(int n : result)
			System.out.print(n+ " ");
	}


}
