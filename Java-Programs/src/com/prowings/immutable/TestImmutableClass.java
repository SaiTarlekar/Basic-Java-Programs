package com.prowings.immutable;

public class TestImmutableClass {

	public static void main(String[] args) {
		
		Address address = new Address(123, "Pune", "India");
		Person p = new Person("Sai", 24, "18/09/1999", address);
		
		System.out.println(p);
		
		address.setCity("Mumbai");
		
		System.out.println(p);
		
		
	}

}
