package com.prowings.classroom;

class Cat {
	String j;

	Cat(String j) {
		this.j = j;
	}
}

class Dog implements Cloneable {
	int i;
	Cat c;

	Dog(int i, Cat c) {
		this.i = i;
		this.c = c;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Cat c1 = new Cat(c.j);
		Dog d2 = new Dog(i, c1);
		return d2;
	}

}

public class DogCatDeepCloning {

	public DogCatDeepCloning() {
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Cat c = new Cat("Sai");
		Dog originalObj = new Dog(10, c);
		System.out.println(originalObj.i + " " + originalObj.c.j);

		Dog clonedObj = (Dog) originalObj.clone();
		System.out.println(clonedObj.i + " " + clonedObj.c.j);

		System.out.println("Reference  : " + (originalObj.equals(clonedObj)));
		System.out.println("Reference for i : " + (originalObj.i == clonedObj.i));
		System.out.println("Reference for Cat(j) : " + (originalObj.c.j == clonedObj.c.j));

	}

}
