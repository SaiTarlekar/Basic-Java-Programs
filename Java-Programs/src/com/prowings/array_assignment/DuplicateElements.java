package com.prowings.array_assignment;

import java.util.Arrays;

public class DuplicateElements {

	public DuplicateElements() {
	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 4, 2, 3, 1 };

		int[] result = findDuplicateElements(nums);
		System.out.println(Arrays.toString(result));
	}

	public static int[] findDuplicateElements(int[] nums) {

		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					counter++;
					break;
				}
			}
		}

		int[] duplicateElements = new int[counter];
		counter = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					duplicateElements[counter] = nums[i];
					counter++;
					break;
				}
			}
		}

		return duplicateElements;
	}

}
