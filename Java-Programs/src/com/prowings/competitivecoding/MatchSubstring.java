package com.prowings.competitivecoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.prowings.patternprinting.Pattern1;

public class MatchSubstring {

	public static void main(String[] args) {
		String haystack = "a";
		String needle = "a";
		
		
		System.out.println(matchSubstring(haystack, needle));
		System.out.println(matchSubstring1(haystack, needle));
		System.out.println(matchSubstring2(haystack, needle));
	}

	public static int matchSubstring(String haystack, String needle) {
		return haystack.indexOf(needle);
	}
	
	public static int matchSubstring1(String haystack, String needle) {
		Pattern pattern = Pattern.compile(needle);
		Matcher m = pattern.matcher(haystack);
		
		if(m.find())
			return m.start();
		else
			return -1;
	}
	
	public static int matchSubstring2(String haystack, String needle) {
		
		int n = haystack.length(), m = needle.length();
		
		if (n >= m) {
			for(int i=0; i<n-m+1; i++) {
				String subStr = haystack.substring(i, i+m);
				if(subStr.equals(needle))
					return i;

			}
			return -1;
		}
		else
			return -1;
	}

}
