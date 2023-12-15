package com.prowings.immutable;

class Address {

	private int pin;
	private String city;
	private String country;
	
	public Address() {}
	
	public Address(int pin, String city, String country) {
		this.pin = pin;
		this.city = city;
		this.country = country;
	}
	
	public Address(Address add) {
		this.pin = add.pin;
		this.city = add.city;
		this.country = add.country;
	}
	
	public int getPin() {
		return this.pin;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", country=" + country + "]";
	}
	
	
}
