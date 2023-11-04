package com.prowings.string;

public class StringEquality {

	public StringEquality() {
	}

	static boolean isEquals(String s1, String s2) {

		if (s1.length() == s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String s1 = "Sai";
		String s2 = "sai";

		System.out.println(4 | 5);
		
		System.out.println(isEquals(s1, s2));
	}

}
