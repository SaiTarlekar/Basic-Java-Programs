package com.prowings.oops.shape_abstraction;

class Circle extends Shape{
	
	private static final double PI = Math.PI;
	private double radius;
	
//	No-Argument Constructor
	public Circle() {}
	
//	Single Parameter Constructor to initialize value of radius
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculateArea() {
		return PI * radius * radius;
	}

	@Override
	public double calculatePerimeter() {	
		return 2 * PI * radius;
	}
}
