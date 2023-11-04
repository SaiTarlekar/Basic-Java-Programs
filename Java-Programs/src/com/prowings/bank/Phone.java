package com.prowings.bank;

public class Phone {

	private String personal;
	private String alternative;

	public Phone() {
	}

	public Phone(String personal, String alternative) {
		this.personal = personal;
		this.alternative = alternative;
	}

	public String getPersonal() {
		return personal;
	}

	public void setPersonal(String personal) {
		this.personal = personal;
	}

	public String getAlternative() {
		return alternative;
	}

	public void setAlternative(String alternative) {
		this.alternative = alternative;
	}

	
	
}
