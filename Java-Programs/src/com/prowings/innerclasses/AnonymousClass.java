package com.prowings.innerclasses;


abstract class AbstractClass{
	abstract void m1();
}


public class AnonymousClass {

	public static void main(String[] args) {
		AbstractClass a1 = new AbstractClass() {
			
			public void m1() {
				System.out.println("Hello");
			}
		};
	}

}
