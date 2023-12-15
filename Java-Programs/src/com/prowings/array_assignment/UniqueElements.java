package com.prowings.array_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElements {

	public UniqueElements() {
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = scan.nextInt();
		int[] nums = new int[size];

		System.out.println("Enter numbers in array :");
		for (int i = 0; i < size; i++)
			nums[i] = scan.nextInt();
		System.out.println(Arrays.toString(findUniqueElements(nums)));
	}

	public static int[] findUniqueElements(int[] nums) {

		int count = 0;
		boolean flag = true;
		int[] array = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] != nums[j])
					flag = true;
				else {
					flag = false;
					break;
				}
			}
			if (flag)
				array[count++] = nums[i];
		}

		int[] uniqueElements = new int[count];

		for (int i = 0; i < count; i++) {
			uniqueElements[i] = array[i];
		}

		return uniqueElements;
	}

}
