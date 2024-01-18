package com.prowings.innerclasses;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class InnerClass {

	public static void main(String[] args) {
		Set<Student> set = new TreeSet<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().length() - s2.getName().length();
//				return s1.getName().compareTo(s2.getName());
//				return Integer.compare(s1.getName().length(), s2.getName().length());
			}
			
		});
		
		
		set.add(new Student("sai"));
		set.add(new Student("sakshi"));
		set.add(new Student("soham"));
		
		System.out.println(set);
	}

}

class Student {
	String name;

	Student(String n) {
		this.name = n;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
}