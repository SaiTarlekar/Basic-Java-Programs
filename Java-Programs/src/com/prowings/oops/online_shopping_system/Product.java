package com.prowings.oops.online_shopping_system;

abstract class Product{
	protected String prodName;
	protected double prodPrice;
	protected String prodDescription;

	public Product() {}
	
	public Product(String prodName, double prodPrice, String prodDescription){
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodDescription = prodDescription;
	}

	protected abstract void productInfo();

	protected double getProductPrice() {
		return prodPrice;
	}

}