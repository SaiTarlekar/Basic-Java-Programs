package com.prowings.competitivecoding;

public class LengthOfLastWord {

	public LengthOfLastWord() {}

	
	public static int lengthOfLastWord(String s) {
		
		String[] array = s.split("\\s+");
		
		String lastWord = array[array.length-1];
		int lengthOfLastWord = lastWord.length();

		
		
		return lengthOfLastWord;
	}
	
	public static void main(String[] args) {
		String s = "Sai Sanjay       Tarlekar";
		System.out.println(lengthOfLastWord(s));
	}

}



