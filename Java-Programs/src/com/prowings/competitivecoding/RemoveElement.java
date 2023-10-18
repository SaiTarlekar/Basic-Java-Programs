package com.prowings.competitivecoding;

import java.util.Arrays;

public class RemoveElement {

	public RemoveElement() {}

	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int val = 3;
		
		System.out.println(removeElement(nums, val));
	}

	private static int removeElement(int[] nums, int val) {
		
		int counter = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != val) {
				counter++;
			}
		}
		
		int[] result = new int[counter];
		counter = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != val) {
				result[counter] = nums[i];
				counter++;
			}
		}
		
		System.out.println(Arrays.toString(result));
		
		return counter;
	}

}
