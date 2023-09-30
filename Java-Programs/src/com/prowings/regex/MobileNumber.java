package com.prowings.regex;
import java.util.regex.*;




public class MobileNumber {	
	public static void main(String[] args) {
		   System.out.println(validate("+917045916332"));		   
	   }
	
	public static String validate(String number) {
		  Pattern pattern = Pattern.compile("(0|[+]?91)?[7-9][0-9]{9}");
		  Matcher m = pattern.matcher(number);

		if (m.find() && m.group().equals(number))
			return "Valid Mobile Number";
		else
			return "Invalid Mobile Number";
	   }
}
