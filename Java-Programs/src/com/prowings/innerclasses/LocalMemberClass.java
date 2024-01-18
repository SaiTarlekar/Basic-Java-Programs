package com.prowings.innerclasses;

/*
 	-> Local Inner Class  cannot be static.
 
 */


public class LocalMemberClass {

	private final int b = 30;
	
	public static void main(String[] args) {
		
		LocalMemberClass o1 = new LocalMemberClass();
		o1.outer();
	}
	
	public void outer() {
		
		System.out.println("Outer Started");
		int a = 10;
		class LocalInnerClass{
			
			public void inner() {
				System.out.println("Inner Started");
				System.out.println(a);
				System.out.println(b);
				System.out.println("Inner Ended");
			}
		}
		
		LocalInnerClass l1 = new LocalInnerClass();
		l1.inner();
		
		
		System.out.println("Outer Ended");
		
	}

}
