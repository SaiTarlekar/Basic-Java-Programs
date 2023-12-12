package com.prowings.interview;

import java.util.Arrays;

public class MissingNaturalNumber {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 6, 7, 8, 9, 10};
		
		System.out.println(Arrays.toString(findMissingNumber(arr)));
	}

	public static int[] findMissingNumber(int[] arr) {

		
//		Arrays.sort(arr);
		int num = arr[0];
		int missing = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				num++;
			} else {
				System.out.println(num+ " is missing.");
				break;
			}
		}
		return arr;
	}

}
