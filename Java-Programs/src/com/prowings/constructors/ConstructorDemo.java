package com.prowings.constructors;
import java.util.Scanner;

public class ConstructorDemo {
	
	int rno;
	String name;
	String address;
	
	
	public ConstructorDemo(int rno, String name, String address) {
		this.rno = rno;
		this.name = name;
		this.address = address;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
//		Accepting values for object
		System.out.println("Enter Roll No : ");
		int rno = scan.nextInt();
		scan.nextLine();
		
		
		System.out.println("Enter Name : ");
		String name = scan.nextLine();
		
		System.out.println("Enter Address : ");
		String address = scan.nextLine();
		
		ConstructorDemo student1 = new ConstructorDemo(rno, name, address);
		System.out.println("Roll No : " +student1.rno+ " \nName : "+student1.name+ " \nAddress : "+student1.address);
		
		
		scan.close();
	}

}
