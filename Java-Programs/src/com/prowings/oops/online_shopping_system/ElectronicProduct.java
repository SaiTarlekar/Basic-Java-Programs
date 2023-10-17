package com.prowings.oops.online_shopping_system;

class ElectronicProd extends Product {

	private String warrantyCard;

	public ElectronicProd() {

	}

	public ElectronicProd(String prodName, double prodPrice, String prodDescription, String wc) {
		super(prodName, prodPrice, prodDescription);
		this.warrantyCard = wc;
	}

	@Override
	public void productInfo() {
		System.out.println("Product Name : " + prodName);
		System.out.println("Product Price : " + prodPrice);
		System.out.println("Product Description : " + prodDescription);
		System.out.println("Product Warranty : " + warrantyCard);
	}

	public String getwarrantyCard() {
		return warrantyCard;
	}

	public void setWarrantyInfo(String warrantyInfo) {
		this.warrantyCard = warrantyInfo;
	}

}
