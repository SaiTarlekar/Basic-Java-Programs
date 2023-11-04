package com.prowings.string;


public class PasswordValidation {

	public PasswordValidation() {
	}

	public static void main(String[] args) {
		String s1 = "";
		
		System.out.println(passwordValidate(s1));
	}

	public static String passwordValidate(String s) {

		int lower = 0, upper = 0, digit = 0, symbol = 0;
		
		if(s == null)
			return "Enter Proper Password";
		
		else if(s.length() >= 8) {
			for(int i=0; i<s.length(); i++) {
				if(Character.isDigit(s.charAt(i)))
					digit++;
				if(Character.isUpperCase(s.charAt(i)))
					upper++;
				if(Character.isLowerCase(s.charAt(i)))
					lower++;
				if("".indexOf(s) >= 1)
					symbol++;
				
				
			}
			

			
			
			return "Strong Password";
		}
		
		else
			return "Weak Password";
		
	}

}
