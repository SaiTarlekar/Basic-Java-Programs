package com.prowings.collegesystem;

public class Address {

	private int pin;
	private String cityName;	
	
	public Address() {}
	
	public Address(int pin, String cn) {
		
		validatePin(pin);
		this.pin = pin;
		
		validateCity(cn);
		this.cityName = cn;
	}
	
	private boolean validateCity(String cn) {
		try {
			if((cn.length() >= 3) && (cn.matches("[a-zA-Z]+")) ) {
				return true;
			}
			else
				throw new IllegalArgumentException("Invalid City Name");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error : " +e.getMessage());
			System.exit(0);
			return false;
		}
	}

	private boolean validatePin(int pin) {
		try {
			String valPin = String.valueOf(pin);
			if(valPin.length() == 6) {
				return true;
			}
			else
				throw new IllegalArgumentException("Incorrect Pin.");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error : " +e.getMessage());
			System.exit(0);
			return false;
		}
	}

	public int getPin() {
		return this.pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	
	public String getCityName() {
		return this.cityName;
	}
	
	public void setCityName(String cn) {
		this.cityName = cn;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", cityName=" + cityName + "]";
	}
	
	

	
}
