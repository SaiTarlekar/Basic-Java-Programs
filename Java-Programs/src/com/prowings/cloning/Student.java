package com.prowings.cloning;

public class Student implements Cloneable{

	int rollNo;
	String name;
	Address address;
	

	public Student() {}


	public Student(int rollNo, String name, Address address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
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


	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}


	@Override
	protected Object clone() throws CloneNotSupportedException{
		
		Student clonedStudent = (Student) super.clone();
		Address clonedAddress = (Address) this.address.clone();
		
		clonedStudent.address = clonedAddress;
		
		return clonedStudent;
	}

}
