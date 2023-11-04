package com.prowings.classroom;

import java.time.chrono.ChronoLocalDate;

class EmpInfo {
	String age;

	EmpInfo(String age) {
		this.age = age;
	}
}

class Employee implements Cloneable {
	int empId;
	String name;
	EmpInfo empInfo;

	public Employee(int empId, String name, EmpInfo empInfo) {
		super();
		this.empId = empId;
		this.name = name;
		this.empInfo = empInfo;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		EmpInfo e2 = new EmpInfo("Sai");
		Employee emp2 = new Employee(empId, name, e2);
		return emp2;
	}

}

public class EmployeeDeepCloning {

	public EmployeeDeepCloning() {
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		EmpInfo e1 = new EmpInfo("Sai");
		Employee originalObj = new Employee(10, "Sakshi", e1);

		System.out.println(originalObj);

		Employee clonedObj = (Employee) originalObj.clone();
		System.out.println(clonedObj);

		System.out.println(originalObj == clonedObj);
		System.out.println(originalObj.empId == clonedObj.empId);
		System.out.println(originalObj.name == clonedObj.name);
		System.out.println(originalObj.empInfo == clonedObj.empInfo);

	}

}
