package com.prowings.interview;

import java.util.Arrays;

public class ArrangeEvenOdd {

	public ArrangeEvenOdd() {}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 4, 7, 8, 11, 20 };
		System.out.println(Arrays.toString(arrangeEvenOdd(arr)));
		System.out.println(Arrays.toString(arrangeEvenOdd1(arr)));
		System.out.println(Arrays.toString(arrangeEvenOdd2(arr)));

	}

	public static int[] arrangeEvenOdd(int[] arr) {
		int[] res = new int[arr.length];
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				res[counter++] = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0)
				res[counter++] = arr[i];
		}
		return res;
	}
	
	public static int[] arrangeEvenOdd1(int[] arr) {
		int[] res = new int[arr.length];
		int evenCount = 0, oddCount = 0;
		for(int num : arr) {
			if(num%2 == 0)
				evenCount++;
			else
				oddCount++;
		}
		int evenIndex = 0;
		int oddIndex = evenCount;
		for(int num : arr) {
			if(num%2 == 0)
				res[evenIndex++] = num;
			else
				res[evenCount++] = num;
		}
		return res;
	}
	
	public static int[] arrangeEvenOdd2(int[] arr) {
		int[] res = new int[arr.length];
		int evenIndex = 0, oddIndex = arr.length-1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2 == 0)
				res[evenIndex++] = arr[i];
			else
				res[oddIndex--] = arr[i];
		}

		return res;
	}

}
