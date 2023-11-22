package com.prowings.regex;

import java.util.regex.*;
class PasswordValidation
{
	
	public static String validate(String s){
		//^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[@#$%^&-+=()])(?=\\S+$).{8, 20}$
		
		
		
//		^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$
		
//		^.(?=.*[0-9a-zA-Z]){8,20}$
		
//		^(.*[a-z])(.*[A-Z])(.*[0-9])$
		
		
		Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#]).{8,20}$");		
		Matcher m = p.matcher(s);
		
		if(m.find() && m.group().equals(s))
			return "True";
		else	
			return "False";
		
	}
	

	public static void main(String args[])
	{
			System.out.println(validate("p@ssw0rd"));
	}
}
