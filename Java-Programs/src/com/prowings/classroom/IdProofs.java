package com.prowings.classroom;

public class IdProofs {
	private int aadhar;
	private String pan;
	
	public IdProofs() {}
	
	public IdProofs(int aad, String pan) {
		this.aadhar = aad;
		this.pan = pan;
	}
	
	public IdProofs(IdProofs id) {
		this.aadhar = id.getAadhar();
		this.pan = id.getPan();
	}
	
	public int getAadhar() {
		return aadhar;
	}
	
	public String getPan() {
		return pan;
	}
	
	public void setAadhar(int aad) {
		this.aadhar = aad;
	}
	
	public void setPan(String pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "IdProofs [aadhar=" + aadhar + ", pan=" + pan + "]";
	}	
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
