package com.prowings.leetcode.bs;

public class FindNextGreatestLetter {

	public static void main(String[] args) {
		char[] chars = {'c', 'f', 'j'};
		char target = 'x';
		
		System.out.println(nextGreatestLetter(chars, target));
		
	}

	public static char nextGreatestLetter(char[] letters, char target) {
		int low = 0;
		int high = letters.length-1;
		while(low <= high) {
            int mid = low + (high - low) / 2;			
			if(target < letters[mid])
				high = mid - 1;
			else 
				low = mid + 1;
        }
		return letters[low % letters.length];
    }
	
}
