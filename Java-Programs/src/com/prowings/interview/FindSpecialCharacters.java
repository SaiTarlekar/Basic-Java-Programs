package com.prowings.interview;

public class FindSpecialCharacters {

	public FindSpecialCharacters() {
	}

	public static void main(String[] args) {
		String s = "Sai@Sai*&";

		int count = countSpecialChars(s);
		System.out.println("Count : " + count);
	}

	public static int countSpecialChars(String s) {

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if ((!Character.isDigit(s.charAt(i))) && (!Character.isLetter(s.charAt(i)))
					&& !(Character.isWhitespace(s.charAt(i))))
				count++;
		}

		return count;
	}

}
