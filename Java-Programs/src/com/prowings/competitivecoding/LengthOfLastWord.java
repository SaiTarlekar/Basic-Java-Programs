package com.prowings.competitivecoding;

public class LengthOfLastWord {

	public LengthOfLastWord() {}

	
	public static int lengthOfLastWord(String s) {
		
		String[] array = s.split(" ");
		
		for(String k: array)
			System.out.println(k);
		
//		char[] charArray = array[array.length].toCharArray();
		int count=0;
//		for(int i=0; i<charArray.length; i++) {
//			count++;
//		}
		
		return count;
	}
	
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println(lengthOfLastWord(s));
	}

}
