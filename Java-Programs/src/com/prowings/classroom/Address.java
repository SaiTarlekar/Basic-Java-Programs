package com.prowings.classroom;

public class Address {

	String add1;
	String add2;
	
	public Address(String add1, String add2) {
		this.add1 = add1;
		this.add2 = add2;
	}
	
	public Address() {}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	
	
	
}
