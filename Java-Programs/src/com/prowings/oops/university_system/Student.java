package com.prowings.oops.university_system;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Enrollable{

	private int studentId;
	private List<Course> enrolledCourses;
	
	public Student() {}
	
	public Student(String name, int age, int Id) {
		super(name, age);
		this.studentId = Id;
		enrolledCourses = new ArrayList<>();
	}
	
	public int getId() {
		return studentId;
	}
	
	public void setId(int Id) {
		this.studentId = Id;
	}
	
	public void showEnrolledCourses() {
		for(Course course : enrolledCourses)
			System.out.println(course.getCourseName()+  " : " +course.getCourseCode());
	}

	@Override
	public void enrollNewCourse(Course course) {
		if(enrolledCourses.contains(course))
			System.out.println("Already present");
		else
			enrolledCourses.add(course);
	}
	
	
	@Override
	public void deleteEnrolledCourse(Course course) {
		if(enrolledCourses.contains(course))
			enrolledCourses.remove(course);
		else
			System.out.println("Course not found");
	}
	
}
