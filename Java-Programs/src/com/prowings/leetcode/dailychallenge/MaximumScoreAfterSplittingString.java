package com.prowings.leetcode.dailychallenge;

public class MaximumScoreAfterSplittingString {

	public static void main(String[] args) {
		
		System.out.println(maxScore("1111"));
		System.out.println(maxScore1("1111"));
	}

	public static int maxScore(String s) {
		int max = 0;
		for(int i=1; i<s.length(); i++) {
			String s1 = s.substring(0, i);
			String s2 = s.substring(i, s.length());
			int zeroCount = 0, onesCount = 0; 
			for(int j=0; j<s1.length(); j++) {
				if(s1.charAt(j) == '0')
					zeroCount++;
			}
			for(int j=0; j<s2.length(); j++) {
				if(s2.charAt(j) == '1')
					onesCount++;
			}
			int sum = zeroCount + onesCount;
			max = (max > sum) ? max : sum;
		}
		return max;
	}
	
	
	public static int maxScore1(String s) {

		int max = 0;
		int zeroCount = 0;
		int onesCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1')
				onesCount++;
		} 
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '0')
				zeroCount++;
			else
				onesCount--;
			int sum = zeroCount + onesCount;
			max = (max > sum) ? max : sum;
		}
		return max;
	}

}
