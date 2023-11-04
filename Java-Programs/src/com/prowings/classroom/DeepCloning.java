package com.prowings.classroom;

public class DeepCloning implements Cloneable{

	int no;
	String name;
	Address address;

	public DeepCloning() {
		// TODO Auto-generated constructor stub
	}

	public DeepCloning(int no, String name, Address address) {
		super();
		this.no = no;
		this.name = name;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
	
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ShallowCloning originalObj = new ShallowCloning();
		ShallowCloning clonedObj = (ShallowCloning) originalObj.clone();

		System.out.println("Reference  : " + (originalObj.equals(clonedObj)));
		System.out.println("Reference for Name : " + (originalObj.name == clonedObj.name));
		System.out.println("Reference for Address : " + (originalObj.address == clonedObj.address));
	}

}
