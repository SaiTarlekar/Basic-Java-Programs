// Question: Check if a given string is a Palindrome or not

package com.prowings.string.assignment;

public class PalindromeChecker {

	public PalindromeChecker() {}

	public static void main(String[] args) {

		String input = "racecar";
		System.out.println(isPalindrome(input) ? "It is a Palindrome" : "Not a Palindrome");

	}

	public static boolean isPalindrome(String s) {

		char[] chars = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;

			i++;
			j--;
		}

		String reversedString = new String(chars);
		return s.equals(reversedString);
	}

}
