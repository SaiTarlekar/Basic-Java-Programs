package com.prowings.serialization;

public class Student extends Person{
	
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	
	Student(){}
	
	Student(int id, String name, int age, String gender){
		super(age, gender);
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
