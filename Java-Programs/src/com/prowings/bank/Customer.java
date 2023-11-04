package com.prowings.bank;

class Customer {

	private String name;
	private Address address;
	private Phone phoneNo;
	private int age;
	private char gender;

	public Customer() {
	}

	public Customer(String name, Address address, Phone phoneNo, int age, char gender) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.age = age;
		this.gender = gender;
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

	public Phone getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Phone phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + ", age=" + age + ", gender="
				+ gender + "]";
	}

}
