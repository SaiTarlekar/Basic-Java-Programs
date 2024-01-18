package com.prowings.classroom;

public final class Person implements Cloneable{
	
	private final String name;
	private final int age;
	private final String DOB;
	private final Addr addr;
	private final PhoneNo phone;
	private final IdProofs id;
	
	public Person() {
		this.name = "";
		this.age = 0;
		DOB = "";
		this.addr = new Addr();
		this.phone = new PhoneNo();
		this.id = new IdProofs();
	}
	
	public Person(String name, int age, String dOB, Addr addr, PhoneNo phone, IdProofs id) {
		this.name = name;
		this.age = age;
		DOB = dOB;
		this.addr = addr;
		this.phone = phone;
		this.id = id;
	}
	
	public Person(Person p) {
		this.name = p.getName();
		this.age = p.getAge();
		this.DOB = p.getDOB();
		this.addr = new Addr(p.getAddr());
		this.phone = new PhoneNo(p.getPhone());
		this.id = new IdProofs(p.getId());
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getDOB() {
		return DOB;
	}

	public Addr getAddr() {
		return new Addr(this.addr);
	}

	public PhoneNo getPhone() {
		return new PhoneNo(this.phone);
	}

	public IdProofs getId() {
		return new IdProofs(this.id);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", DOB=" + DOB + ", addr=" + addr + ", phone=" + phone
				+ ", id=" + id + "]";
	}

	public int hashcode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result)+ age;
		result = (prime * result)+((name == null) ? 0 : name.hashCode());
		result = (prime * result)+((DOB == null) ? 0 : DOB.hashCode());
		result = (prime * result)+((addr == null) ? 0 : addr.hashCode());
		result = (prime * result)+((phone == null) ? 0 : phone.hashCode());
		result = (prime * result)+((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o)
			return true;
		if (o == null)
			return false;
		if(this.getClass() != o.getClass())
			return false;
		if(o instanceof Person) {
			Person p = (Person) o;
			if(this.id.getAadhar() == p.id.getAadhar())
				if(this.id.getPan().equals(p.id.getPan()))
					return true;
		}
		return false;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return new Person(this);
	}
	
}
