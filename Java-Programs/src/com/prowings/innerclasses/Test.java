package com.prowings.innerclasses;

public class Test{
	int x = 10;
	
	public void m1() {
		int y = 20; 
		
		class Inner{
			
			public void m2() {
				System.out.println(x);
				System.out.println(y);
			}
		}
		
		Inner i = new Inner();
		i.m2();
	}
	
	
	public static void main(String[] args) {
		new Test().m1();
	}
}
