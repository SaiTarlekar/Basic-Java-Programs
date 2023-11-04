package com.prowings.bank;

class Address {

	private String currentAdd;
	private String permanentAdd;

	public Address() {
	}

	public Address(String currentAdd, String permanentAdd) {
		this.currentAdd = currentAdd;
		this.permanentAdd = permanentAdd;
	}

	public String getCurrentAdd() {
		return currentAdd;
	}

	public void setCurrentAdd(String currentAdd) {
		this.currentAdd = currentAdd;
	}

	public String getPermanentAdd() {
		return permanentAdd;
	}

	public void setPermanentAdd(String permanentAdd) {
		this.permanentAdd = permanentAdd;
	}

	
	
}
