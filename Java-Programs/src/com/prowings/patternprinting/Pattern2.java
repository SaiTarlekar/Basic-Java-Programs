package com.prowings.patternprinting;

public class Pattern2 {
	public static void printPattern(int num) {
		
		for(int rows=0; rows<num; rows++) {
			
			for(;;) {
				System.out.println("*  ");
			}
		}
		
		
		
	}
	
	
	public static void main(String args[]) {
		printPattern(5);
	}
}


/* Output : -

 		   * 
         * * 
       * * * 
     * * * * 
   * * * * * 


 * */
