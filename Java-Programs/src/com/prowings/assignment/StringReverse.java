// Question : Write a program to reverse a given string.


package com.prowings.assignment;

public class StringReverse {

	public StringReverse() {
	}

	public static void main(String[] args) {

		String input = "MaDam";
		System.out.println("String Before Reverse : " + input);
		
//		Method 1
		System.out.println("String After Reversal : " + stringReverse1(input));
		
//		Method 2
		System.out.println("String After Reversal : " + stringReverse2(input));
		
//		Method 3
		System.out.println("String After Reversal : " + stringReverse1(input));

	}

	
	/*
	 * Take String as Input 
	 * Convert the String into array of characters
	 * Create a new array for storing the characters in reverse
	 * Access each element from last and store into newly created array
	 * Create new String of characters and return the String
	 */
	
	public static String stringReverse1(String s) {

		char[] chars = s.toCharArray();
		char[] reversedStringchars = new char[s.length()];
		int count = 0;

		for (int i = chars.length - 1; i >= 0; i--) {
			reversedStringchars[count] = chars[i];
			count++;
		}

		return new String(reversedStringchars);
	}

	
	/*
	 * Take String as Input 
	 * Create a new array for storing the characters in reverse
	 * Access each element of String using charAt() from last and store it in newly created array
	 * Create new String of characters and return the String
	 */
	public static String stringReverse2(String s) {
		
		char[] reversedStringchars = new char[s.length()];
		int count = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			reversedStringchars[count] = s.charAt(i);
			count++;
		}
		
		return new String(reversedStringchars);
	}
	
	/*
	 * Take String as input
	 * Convert the String into array of characters
	 * Start reversing the start character and last character till it i < j
	 * Create new String of characters and return the String
	 */
	
	public static String stringReverse3(String s) {
		
		
		char[] chars = s.toCharArray();
		
		int i = 0;
		int j = s.length()-1;
		
		while(i < j) {
			char temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
			
			i++;
			j--;
		}
		
		
		return new String(chars);
	}
	
	
	
	
}
