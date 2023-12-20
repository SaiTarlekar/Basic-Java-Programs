package com.prowings.leetcode.dailychallenge;

import java.util.Arrays;

public class MergeStringsAlternately {

	public static void main(String[] args) {
		String word1 = "abcd";
		String word2 = "pqr";
		
		
		System.out.println(mergeAlternately(word1, word2));
	}

	public static String mergeAlternately(String word1, String word2) {
//		int min = (word1.length() < word2.length()) ? word1.length() : word2.length();
//		String[] word1Arr = word1.split(""); 
//		String[] word2Arr = word2.split(""); 
//		int n = word1.length();
//		int m = word2.length();
//		String[] result  = new String[n + m];
//		int count = 0;
//		for(int i=0; i<min; i++) {
//			result[count++] = word1Arr[i];
//			result[count++] = word2Arr[i];
//		}
//		if(n > m)
//			System.arraycopy(word1Arr, min, result, count, n-m);
//		else
//			System.arraycopy(word2Arr, min, result, count, m-n);
//		String word = "";
//		for(int i=0; i<result.length; i++) {
//			word += result[i];
//		}
//		return word;
		
		
		
		int min = Math.min(word1.length(), word2.length());
		int n = word1.length();
		int m = word2.length();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<min; i++)
			sb.append(word1.charAt(i)).append(word2.charAt(i));
		
		if(n > m)
			sb.append(word1, min, n);
		else
			sb.append(word2, min, m);
		
		return new String(sb);
		
		
	}

}



/*
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:

Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:

Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 

Constraints:

1 <= word1.length, word2.length <= 100
word1 and word2 consist of lowercase English letters.
 */

