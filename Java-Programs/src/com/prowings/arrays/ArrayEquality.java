package com.prowings.arrays;

public class ArrayEquality {

	public ArrayEquality() {}

	
	static boolean checkEquality(int[] nums, int[] nums1) {
	
		boolean isEqual = false;
		
		if(nums.length == nums1.length) {
			for(int i=0; i<nums.length; i++) {
				if(nums[i] == nums1[i]) {
					isEqual = true;
				}
				else {
					isEqual = false;
					return isEqual;
				}
			}			
		}
		
		
		return isEqual;
		
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,4};		
		int[] nums1 = {1,2,3};

		
		if(checkEquality(nums, nums1))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

}
