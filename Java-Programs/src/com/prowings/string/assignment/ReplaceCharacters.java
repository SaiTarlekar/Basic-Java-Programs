package com.prowings.string.assignment;

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
		
		
//		Method 3: Own Method (Using StringBuffer)
		System.out.println(replaceCharacter3(input, toBeReplaced, replaceBy));

	}

//	With replace method we can set a sequence characters in place of String
	public static String replaceCharacter(String s, String toBeReplaced, String replaceBy) {
		return s.replace(toBeReplaced, replaceBy);
	}

//	We can replace only one character 
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

	public static String replaceCharacter3(String s, String toBeReplaced, String replaceBy) {

		StringBuffer sb = new StringBuffer(s);
		char toBeRep = toBeReplaced.charAt(0);
		char repBy = replaceBy.charAt(0);
		
		for(int i=0; i<sb.length(); i++) {
			if(sb.charAt(i) == toBeRep) {
				sb.setCharAt(i, repBy);
			}
		}
		return new String(sb);
	}

}


/*
 * Output: - 

Enter a String : 
Shri Ram
Enter Character to get replaced : 
i
Enter Character to be replaced by : 
ee
Shree Ram
Shre Ram
Shre Ram

*/
