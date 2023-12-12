package com.prowings.copyconstructor;

public class TestDeepCloning {

	public static void main(String[] args) {
		Address add = new Address(410206, "Mumbai", "India");
		Student stud1 = new Student(1, "Sai", add);
		
		Student stud2 = new Student(stud1);
		
		System.out.println(stud1);
		System.out.println(stud2);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		stud1.getAddress().setCity("Pune");
		
		System.out.println(stud1);
		System.out.println(stud2);
		
	}

}
