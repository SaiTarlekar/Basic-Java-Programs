package com.prowings.collegesystem;

public class CollegeSystem {

	public CollegeSystem() {}

	public static void main(String[] args) {
		
		Address add1 = new Address(410206, "Mumbai");
		Principal prin = new Principal("Sai", 24, "7045916332", add1);
		

		Address add2 = new Address(410209, "Sangli");
		Student s = new Student(1, "Shakshi", 21, "+919304026549", add2);
		
		System.out.println(prin);
		System.out.println(s);
		
		
		prin.changeName(s, "Sai");
		System.out.println(s);
		
	}

}
