package com.prowings.classroom;

public class Addr {

	private String permAdd;
	private String altAdd;

	public Addr() {}
	
	public Addr(String permAdd, String altAdd) {
		this.permAdd = permAdd;
		this.altAdd = altAdd;
	}
	
	public Addr(Addr add) {
		this.permAdd = add.getPermAdd();
		this.altAdd = add.getAltAdd();
	}
	
	public String getPermAdd() {
		return permAdd;
	}

	public void setPermAdd(String permAdd) {
		this.permAdd = permAdd;
	}

	public String getAltAdd() {
		return altAdd;
	}

	public void setAltAdd(String altAdd) {
		this.altAdd = altAdd;
	}

	@Override
	public String toString() {
		return "Addr [permAdd=" + permAdd + ", altAdd=" + altAdd + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	
}
