package com.prowings.arrays;

import java.util.Scanner;

public class SelectionSort {

	private static Scanner scan = new Scanner(System.in);

	public SelectionSort() {
	}

	static int[] sortingArray(int[] nums) {
		
		for(int i=0; i<nums.length; i++) {
			int smallest = i;
			for(int j=i+1; j<nums.length; j++) {
				if(nums[smallest] > nums[j])
					smallest = j;
			}
			int temp = nums[smallest];
			nums[smallest] = nums[i];
			nums[i] = temp;
		}
		return null;
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
		int[] sortedArray = sortingArray(nums);
		for (int n : nums) {
			System.out.print(n + " ");
		}
	}

}
