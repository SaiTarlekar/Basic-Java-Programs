package com.prowings.interview;

public class RemoveCharacterFromString {

	public static void main(String[] args) {
		String str = "Sai Tarlekar";
		char ch = 'a';

	
		System.out.println(removeChar(str, ch));
	}

	public static String removeChar(String str, char ch) {

		StringBuffer sb = new StringBuffer(str);
		StringBuffer sb1 = new StringBuffer();
		

		for(int i=0; i<str.length(); i++) {
			if(sb.charAt(i) != ch)
				sb1.append(sb.charAt(i)); 
		}

		return new String(sb1);
	}

}
