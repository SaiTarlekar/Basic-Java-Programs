package com.prowings.object;


public class TestCloning {

	public static void main(String[] args) {

		Address add = new Address(410206, "Mumbai", "India");
		Employee e1 = new Employee(1, "Sai", add);
		Employee e2 = null;
		try {
			e2 = (Employee) e1.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println(e1);
		System.out.println(e2);
		
		e1.getAddress().setCity("Pune");
		
		System.out.println(e1);
		System.out.println(e2);
	}

}
