package com.prowings.assignment;

import java.util.Scanner;

public class ReplaceCharacters {

	public ReplaceCharacters() {
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a String : ");
		String input = scan.nextLine();

		System.out.println("Enter Character to get replaced : ");
		String toBeReplaced = scan.next();

		System.out.println("Enter Character to be replaced by : ");
		String replaceBy = scan.next();

//		Method 1: Using replace()
		System.out.println(replaceCharacter(input, toBeReplaced, replaceBy));
		
		
//		Method 2: Own Method
		System.out.println(replaceCharacter1(input, toBeReplaced, replaceBy));
		


	}

	public static String replaceCharacter(String s, String toBeReplaced, String replaceBy) {
		return s.replace(toBeReplaced, replaceBy);
	}

	public static String replaceCharacter1(String s, String toBeReplaced, String replaceBy) {

		char[] chars = s.toCharArray();
		char toBeRep = toBeReplaced.charAt(0);
		char repBy = replaceBy.charAt(0);

		for (int i = 0; i < s.length(); i++) {
			if (chars[i] == toBeRep)
				chars[i] = repBy;
		}

		return new String(chars);
	}
	
	
}
