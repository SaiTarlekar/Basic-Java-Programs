package com.prowings.regex;

import java.util.regex.*;

public class EmailIds {
	
	
	public static String validMails(String mail) {
//		String regex = "[\\w]"
//				+ "[\\w\\W]*"
//				+ "@"
//				+ "[\\w]+"
//				+ "([.][a-zA-Z]+)+";
		
		
		String regex = "[\\w]"
		+ "[\\w\\W]*"
		+ "@"
		+ "gmail[.]com";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mail);
		
		if(m.find() && m.group().equals(mail))
			return "Valid Email Id";
		else
			return "Invalid Email Id";
	}
	
	
	public static void main(String args[]) {
		System.out.println(validMails("starlekar1@gmail.com"));
	}
}
