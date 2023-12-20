package com.prowings.leetcode.interview;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		
		merge(nums1, nums1.length, nums2, nums2.length);
//		merge1(nums1, nums1.length, nums2, nums2.length);
	}

	public static void merge(int[] nums1, int n, int[] nums2, int m) {

		for(int i=0; i<m; i++) {
			int index = findIndex(nums1, nums2[i], n, m);
			
			System.out.println(nums2[i]+ " " +index);
			addElement(nums1, nums2[i], index);
		}
	}

	public static void addElement(int[] nums1, int element, int index) {
		for(int i=nums1.length-2; i>=index; i--) {
			nums1[i+1] = nums1[i];
		}
		nums1[index] = element;
		
		System.out.println(Arrays.toString(nums1));
		
	}

	public static int findIndex(int[] nums1, int target, int n, int m) {
		int low = 0;
		int high = m-1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(target == nums1[mid])
				return mid;
			else if(target > nums1[mid])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return low;
	}
	
	public static void merge1(int[] nums1, int n, int[] nums2, int m) {
		
		for(int i=0; i<nums2.length; i++) {
			nums1[m++] = nums2[i];
		}
		Arrays.sort(nums1);
	}
}

