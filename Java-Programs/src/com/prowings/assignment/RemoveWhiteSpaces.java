// Question: Remove all white spaces from a string.

package com.prowings.assignment;

public class RemoveWhiteSpaces {

	public RemoveWhiteSpaces() {}

	public static void main(String[] args) {
		String input = "My name is       Sai";
		System.out.println(removeSpaces(input));
	}

	public static String removeSpaces(String s) {		
		return s.replace(" ", "");
	}

}
