package com.prowings.interview;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {

		int[] arr1 = {3, 2, 5, 7};
		int[] arr2 = {2, 3, 5, 7};
		
		
		System.out.println(compare(arr1, arr2));
		System.out.println(compare1(arr1, arr2));
		
		
	}

	public static String compare(int[] arr1, int[] arr2) {

		int counter = 0;
		if(arr1.length == arr2.length) {
			for(int i=0; i<arr1.length; i++) {
				boolean flag = false;
				for(int j=0; j<arr2.length; j++) {
					if(arr1[i] == arr2[j]) {
						arr2[j] = ' ';
						flag = true;
					}
				}
				if(!flag)
					return "Not Equal";
			}
			return "Equal";
		}
		else 
			return "Not Equal";
	}

	
	public static String compare1(int[] arr1, int[] arr2) {

		int n = arr1.length;
		int m = arr2.length;
		
		if(n != m) {
			return "Not Equal";			
		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for(int i = 0; i < n; i++) {
			if(arr1[i] != arr2[i]) {
				return "Not Equal";
			}
		}
		return "Equal";
	}
}
