package com.prowings.cloning;

public class TestDeepCloning {

	public static void main(String[] args) {
		Address add = new Address(410206, "Mumbai", "India");
		Student stud1 = new Student(1, "Sai", add);
		
		Student stud2 = null;
		
		try {
			stud2 = (Student) stud1.clone();
		}
		catch(CloneNotSupportedException e) {
			System.err.println("Error while cloning Student object.");
		}
		
		
		System.out.println(stud1);
		System.out.println(stud2);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		stud1.address.city = "Pune";
		
		System.out.println(stud1);
		System.out.println(stud2);
		
	}

}
