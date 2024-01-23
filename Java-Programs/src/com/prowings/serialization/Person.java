package com.prowings.serialization;

import java.io.Serializable;

public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;

	int age;
	String gender;
	
	
	Person(){}
	
	Person(int age, String gender){
		this.age = age;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", gender=" + gender + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
}
