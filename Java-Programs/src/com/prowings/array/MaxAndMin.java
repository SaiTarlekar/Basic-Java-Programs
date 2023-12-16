// Write a Java program to find the maximum and minimum value of an array.

package com.prowings.array;

public class MaxAndMin {

	public MaxAndMin() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int[] nums = {2, 1, 30, 20, 66, 01, -3};
		
		int[] result = findMinMax(nums);
		System.out.println("Maximum : "+result[0]+ "\nMinimum : "+result[1]);
	}

	private static int[] findMinMax(int[] nums) {

		int max = nums[0];
		int min = nums[0];
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] > max)
				max = nums[i];
			
			if(nums[i] < min)
				min = nums[i];
		}
		int[] result = new int[2];
		result[0] = max;
		result[1] = min;
		
		
		return result;
	}

}
