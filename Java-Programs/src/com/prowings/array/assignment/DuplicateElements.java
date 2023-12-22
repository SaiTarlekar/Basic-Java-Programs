package com.prowings.array.assignment;

import java.util.Arrays;

public class DuplicateElements {

	public DuplicateElements() {
	}

	public static void main(String[] args) {

		int[] nums = { 1, 3, 4, 2, 3, 5, 4, 3, 2 ,7,3,7,2,4 };
		// [4, 5]
		int[] result = findDuplicateElements(nums);
		System.out.println(Arrays.toString(result));
	}

	public static int[] findDuplicateElements(int[] nums) {

		
		int[] dup = new int[nums.length];
		int flag = 0;
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			for(int j = i+1; j<nums.length; j++) {
				if(nums[i] == nums[j]) {
					flag = nums[j];
					nums[j] = -1;
				}
			}
			dup[count++] = flag;
		}
		
		count = 0;
		boolean isUnique = false;
		int[] array = new int[dup.length];
		
		for(int i=0; i<dup.length; i++) {
			for(int j=0; j<dup.length; j++) {
				if((dup[i] != array[j]) && (dup[i] != -1))
					isUnique = true;
				else {
					isUnique = false;
					break;
				}
			}
			if(isUnique)
				array[count++] = dup[i];
		}
		
		int[] dupElements = new int[count];
		for(int i = 0; i < count; i++) {
			dupElements[i] = array[i];
		}

		return dupElements;
	}
}
