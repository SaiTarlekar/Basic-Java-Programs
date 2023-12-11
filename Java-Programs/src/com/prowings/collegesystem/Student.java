package com.prowings.collegesystem;

public class Student extends Person{
	
	int rollNo;
	
	
	public Student() {}
	
	public Student(int rn, String name, int age, String ph, Address add) {
		super(name, age, ph, add);
		this.rollNo = rn;
	}


}
