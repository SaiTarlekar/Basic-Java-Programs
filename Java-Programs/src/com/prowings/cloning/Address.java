package com.prowings.cloning;

public class Address implements Cloneable{

	int pin;
	String city;
	String country;
	
	
	public Address() {}


	public Address(int pin, String city, String country) {
		super();
		this.pin = pin;
		this.city = city;
		this.country = country;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + ", country=" + country + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}