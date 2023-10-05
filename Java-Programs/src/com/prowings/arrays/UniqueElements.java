package com.prowings.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueElements {

	private static Scanner scan = new Scanner(System.in);
	
	public UniqueElements() {}

	public static int[] findUniqueElements(int[] nums) {
		
//		List<Integer> uniqueElements = new ArrayList<>();

		int[] uniqueElements = new int[nums.length];

		
	
		return uniqueElements;
	}

	public static void main(String[] args) {
		System.out.println("Enter Size of Array : ");
		int size = scan.nextInt();
		
		int[] nums = new int[size];
		System.out.println("Enter Numbers : ");
		
		for(int i=0; i<size; i++) {
			System.out.print("nums[" +(i+1)+"] : ");
			nums[i] = scan.nextInt();
		}
		
		int[] result = findUniqueElements(nums);
		for(int num: result)
			System.out.print(num+ " ");
	}


}
