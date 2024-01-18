package com.prowings.classroom;

public class PhoneNo {
	private String phone;
	private String altPhone;
	
	public PhoneNo() {}
	
	public PhoneNo(String ph, String altPh) {
		this.phone = ph;
		this.altPhone = altPh;
	}
	
	public PhoneNo(PhoneNo ph) {
		this.phone = ph.getPhone();
		this.altPhone = ph.getAltPhone();
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAltPhone() {
		return altPhone;
	}
	
	public void setPhone(String ph) {
		phone = ph;
	}
	
	public void setAltPhone(String altPh) {
		altPhone = altPh;
	}

	@Override
	public String toString() {
		return "PhoneNo [phone=" + phone + ", altPhone=" + altPhone + "]";
	}	
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
