package com.prowings.regex;
import java.util.regex.*;

public class EmailTest {
	public static String validate(String text)
	   {
		   //Pattern pattern = Pattern.compile("\\Bg\\B");
		int count = 0;
		String regex = "[a-z][0-9]*"
		   		+ "[@]"
		   		+ "gmail[.]com";
	   Pattern pattern = Pattern.compile(regex);
		   Matcher m = pattern.matcher(text);

	

		   if (m.find() && m.group().equals(text))
			   return "True";
		   else
			   return "False";
	   }
			
		
		public static void main(String[] arg) 
		{
			/*System.out.println("Enter Password : ");
			String password = scan.nextLine();	
			System.out.println(passValidation(password));*/

		  System.out.println(validate("dhanashri@gmail.com"));	
		}
}

