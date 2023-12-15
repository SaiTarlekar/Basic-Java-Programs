package com.prowings.immutable;

public final class Person {

	private final String name;
	private final int age;
	private final String dob;
	private final Address address;
	
	public Person() {
		this.name = "";
		this.age = 0;
		this.dob = "";
		this.address = null;
	}
	
	public Person(String name, int age, String dob, Address address) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.address = new Address(address);
	}
	

	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getDOB() {
		return this.dob;
	}

	public Address getAddress() {
		return new Address(this.address);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", dob=" + dob + ", address=" + address + "]";
	}

}
