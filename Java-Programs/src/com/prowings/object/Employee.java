package com.prowings.object;

public class Employee implements Cloneable{

	int id;
	String name;
	Address address;

	public Employee() {
		super();
	}

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

//		Address cloneAdd = this.getAddress();
//		Employee clonedEmp = this;
//		clonedEmp.setAddress(cloneAdd);
//		return clonedEmp;
		
		
		
		Employee clonedEmp = (Employee) super.clone();
		Address clonedAdd = (Address) this.address.clone();
		clonedEmp.setAddress(clonedAdd);
		
		return clonedEmp;
	
		
	}

}
