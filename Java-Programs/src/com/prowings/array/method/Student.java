package com.prowings.array.method;

public class Student implements Comparable<Student>{

	
	private int id;
	private String name;
	private String add;
	
	public Student() {
		super();
	}

	public Student(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	
	public int compareTo(Student std) {
		
		return Integer.compare(this.id, std.id);
//		return this.name.compareTo(std.name);
		
//		if(this.id == std.id)
//			return 0;
//		else if(this.id > std.id)
//			return 1;
//		else
//			return -1;
		
		
	}

}
