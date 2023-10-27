package com.prowings.oops.university_system;

abstract class UniversityDepartment {

	private String deptName;
	
	public UniversityDepartment() {}
	
	public UniversityDepartment(String name) {
		this.deptName = name;
	}

	public String getDeptName() {
		return deptName;
	}
	
	public void setDeptName(String name) {
		this.deptName = name;
	}
}
