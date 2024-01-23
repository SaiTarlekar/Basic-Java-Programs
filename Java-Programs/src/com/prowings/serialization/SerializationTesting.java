package com.prowings.serialization;

import java.io.*;
import java.util.*;
public class SerializationTesting {

	public static void main(String[] args) {
		Set<Student> record = new LinkedHashSet<>();
		record.add(new Student(1, "Sai", 24, "Male"));
		record.add(new Student(2, "Sakshi", 21, "Femal"));
		record.add(new Student(4, "Soham", 16, "Male"));
		record.add(new Student(8, "Mayu", 20, "Female"));
		
		try {
			File file = new File("record.txt");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
			
			oos.writeObject(record);
			
		}
		
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
	}

}
