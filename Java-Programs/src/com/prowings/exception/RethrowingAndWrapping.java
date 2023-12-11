package com.prowings.exception;

public class RethrowingAndWrapping {

	public RethrowingAndWrapping() {}

	public static void main(String[] args) {
		try {
			m1();
			m2();
			m3();
		}
		catch(CustomException e) {
			System.out.println(e);
		}
		
	}
	
	
	
	
	static void m1() {
		try {
//			throw new ArithmeticException("Error in m1() -> AE");
		}
		catch(ArithmeticException e) {
			throw new CustomException(e.getMessage());
		}
	}
	
	
	static void m2() {
		try {
			throw new ClassCastException("Error in m2() -> CCE");
		}
		catch(ClassCastException e) {
			throw new CustomException(e.getMessage());
		}
	}
	
	static void m3() {
		try {
			throw new CustomException("Error in m3() -> CE");
		}
		catch(CustomException e) {
			throw e;
		}
	}

}
