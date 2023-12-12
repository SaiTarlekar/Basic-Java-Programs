package com.prowings.copyconstructor;

public class Student{

	private int rollNo;
	private String name;
	private Address address;
	

	public Student() {}


	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	
	public Student(Student std) {
		this.rollNo = std.getRollNo();
		this.name = std.getName();
		
//		Address add = new Address();
//		add.setPin(std.getAddress().getPin());
//		add.setCity(std.getAddress().getCity());
//		add.setCountry(std.getAddress().getCountry());
//		this.address = add;

		
		
//		this.address = new Address(std.getAddress().getPin(), 
//				std.getAddress().getCity(), std.getAddress().getCountry());

		
		this.address = new Address(std.address);
		
	}

	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}


}
