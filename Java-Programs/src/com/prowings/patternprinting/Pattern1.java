package com.prowings.patternprinting;

public class Pattern1 {
	public static void printPattern(int num) {
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String args[]) {
//		printPattern(10);
		System.out.println(args[0]);
	
	}
}


/* Output : -

* 
* * 
* * * 
* * * * 
* * * * *  

 * */
