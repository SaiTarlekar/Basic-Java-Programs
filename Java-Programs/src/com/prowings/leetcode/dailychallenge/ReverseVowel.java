package com.prowings.leetcode.dailychallenge;

import java.util.Arrays;

public class ReverseVowel {

	public static void main(String[] args) {
		String s = "leetcode";
		
		System.out.println(reverseVowels(s));
		System.out.println(reverseVowels(s));
		
	}
	
	public static String reverseVowels(String s) {
        
		char[] chars = s.toCharArray();
		int count = 0;

		char[] vowel = new char[chars.length];
		for(int i= s.length()-1; i>=0 ;i--) {
			char curChar = chars[i];
			if(curChar == 'A' || curChar == 'E' ||curChar == 'I' || curChar == 'O' || curChar == 'U' ||
					curChar == 'a' || curChar == 'e' || curChar == 'i' || curChar == 'o' || curChar == 'u') {
				vowel[count++] = curChar;
			}
		}
		
		count = 0;
		for(int i=0; i<chars.length; i++) {
			char curChar = chars[i];
			if(curChar == 'A' || curChar == 'E' ||curChar == 'I' || curChar == 'O' || curChar == 'U' ||
					curChar == 'a' || curChar == 'e' || curChar == 'i' || curChar == 'o' || curChar == 'u') {
				chars[i] = vowel[count++];
			}
		}
		
		return new String(chars);
    }


}





/*
 * 
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.
 */
