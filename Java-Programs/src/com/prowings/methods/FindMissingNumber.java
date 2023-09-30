package com.prowings.methods;

import java.util.Scanner;

//public class FindMissingNumber {
//
//	public FindMissingNumber() {
//		
//		
//		
//	}
//
//	static void findMissingNumber(int[] array, int size) {
//	
//	}
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Enter size of array : ");
//		int size = scan.nextInt();
//		int[] array = new int[size];
//
//		System.out.println("\n\nEnter Numbers in array : ");
//		for (int i = 0; i < size; i++) {
//			array[i] = scan.nextInt();
//		}
//
//		findMissingNumber(array, size);
//
//	}
//
//}


public class FindMissingNumber {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        
        // Calculate the expected sum of the first n natural numbers
        int expectedSum = (n * (n + 1)) / 2;
        
        // Calculate the actual sum of the elements in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // Find and return the missing number
        return expectedSum - actualSum;
    }
    
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 6, 7, 8};
        int missingNumber = findMissingNumber(nums);
        System.out.println("Missing Number: " + missingNumber); // Output: 2
    }
}



