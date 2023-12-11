package com.prowings.collegesystem;

public class Person {

	protected String name;
	private int age;
	private String phone;
	private Address add;

	public Person() {
	}

	public Person(String name, int age, String phone, Address add) {
		super();

		validateName(name);
		this.name = name;

		validateAge(age);
		this.age = age;

		validatePhone(phone);
		this.phone = phone;

		this.add = add;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (validateAge(age))
			this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if (validatePhone(phone))
			this.phone = phone;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phone=" + phone + ", add=" + add + "]";
	}

	private boolean validateName(String name) {
		try {
			if ((name.length() >= 2) && (name.matches("[a-zA-Z]+"))) {
				return true;
			} else
				throw new IllegalArgumentException("Invalid Person Name");
		} catch (IllegalArgumentException e) {
			System.out.println("Error : " + e.getMessage());
			System.exit(0);
			return false;
		}
	}

	private boolean validateAge(int age) {
		try {
			if (age >= 16) {
				return true;
			} else
				throw new IllegalArgumentException("Minimum age should be 16");
		} catch (IllegalArgumentException e) {
			System.out.println("Error : " + e.getMessage());
			System.exit(0);
			return false;
		}
	}

	private boolean validatePhone(String phone) {
		try {
			if (phone.matches("(0|[+]?91)?[7-9][0-9]{9}")) {
				return true;
			} else
				throw new IllegalArgumentException("Invalid Phone Number");
		} catch (IllegalArgumentException e) {
			System.out.println("Error : " + e.getMessage());
			System.exit(0);
			return false;
		}
	}

	public void updateName(Person p, String name) {

		try {
			if (this instanceof Principal) {
				if (p instanceof Student) {
					Student s = (Student) p;
					validateName(name);
					s.name = name;
				}

			}
		} catch (UnauthorizedException e) {
			System.out.println("Only Principal can change the name.");
		}

	}

}
