package com.prowings.oops.university_system;

public class Course{

	private int courseCode;
	private String courseName;
	
	public Course() {}

	public Course(int code, String name) {
		this.courseCode = code;
		this.courseName = name;
	}
	
	public int getCourseCode() {
		return courseCode;
	}
	
	public String getCourseName() {
		return courseName;
	}

}
