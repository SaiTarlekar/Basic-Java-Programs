package com.prowings.constructors;

public class Car {

	int make;
	String companyName;
	static String color = "Red";

	
	public Car(int make, String companyName) {
		this.make = make;
		this.companyName = companyName;
	}

	public Car(int make, String companyName, String color) {
		this.make = make;
		this.companyName = companyName;
		this.color = color;
	}
	
	
	public Car(String s1, String s2) {
		
	}

	
	public String toString() {
		return "Make : " + this.make + "" + "\nCompany Name : " + this.companyName + "" + "\nColor : " + color;
	}

	
	public static void main(String[] args) {
		Car c1 = new Car(2010, "Maruti");
		System.out.println(c1);
		
		Car c2 = new Car(2018, "BMW", "Black");
		System.out.println(c2);
		
		
		
	}
}
