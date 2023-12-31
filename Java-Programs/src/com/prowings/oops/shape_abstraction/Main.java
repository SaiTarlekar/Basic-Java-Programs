package com.prowings.oops.shape_abstraction;

public class Main {

	public Main() {}
	
	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		Rectangle rectangle = new Rectangle(4.0, 6.0);
		Triangle triangle = new Triangle(3.0, 4.0, 5.0);

		// Calculate and print areas and perimeters
		System.out.println("Circle Area : " + circle.calculateArea());
		System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

		System.out.println("Rectangle Area: " + rectangle.calculateArea());
		System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

		System.out.println("Triangle Area: " + triangle.calculateArea());
		System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
		
	}

}
