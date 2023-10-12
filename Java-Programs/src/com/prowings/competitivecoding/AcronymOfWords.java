package com.prowings.competitivecoding;

import java.util.ArrayList;
import java.util.List;

public class AcronymOfWords {

	public AcronymOfWords() {}

	public static void main(String args[]) {

		List<String> words = new ArrayList<>();

		words.add("w");
		words.add("eshensjifo");
//		words.add("charlie");

		String s = "ez";

		if (isAcronym(words, s))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static boolean isAcronym(List<String> words, String s) {

		boolean flag = false;
		int counter = 0;
		if (words.size() != s.length())
			return false;
		else
			for (int i = 0; i < words.size(); i++) {
				if (words.get(i).charAt(0) == s.charAt(counter)) {
					counter++;
					flag = true;
				} else
					return false;
					
			}
		if (flag)
			return true;
		else
			return false;
	}
}
