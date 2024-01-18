package com.prowings.classroom;

public class ObjectMethods {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Person p1 = new Person("Sai", 25, "18/09/1999", 
				new Addr("Panvel", "Pune"), 
				new PhoneNo("7045", "9163"), 
				new IdProofs(12345, "ABC123"));
		System.out.println(p1);
		
//		Shallow Cloning 
//		Person p2 = (Person) p1.clone();
//		System.out.println(p2);
//		p1.getAddr().setPermAdd("Panvel");
//		p1.getAddr().setAltAdd("Wakad");
//		System.out.println(p1);
//		System.out.println(p2);

//		Deep Cloning
//		Person p2 = (Person) p1.clone();
//		System.out.println(p2);
//		p1.getAddr().setPermAdd("Kamothe");
//		p1.getAddr().setAltAdd("Wakad");
//		System.out.println(p1);
//		System.out.println(p2);
		
//		Person p2 = (Person) p1.clone();
//		System.out.println(p2);
		p1.getAddr().setPermAdd("Kamothe");
		p1.getId().setAadhar(54321);
		System.out.println(p1);
//		System.out.println(p2);
		
	}

}
