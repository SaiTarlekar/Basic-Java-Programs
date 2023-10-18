package com.prowings.oops.online_shopping_system;

class ClothingProd extends Product {

	private int productSize;
	private String productColor;

	public ClothingProd() {}

	public ClothingProd(String prodName, double prodPrice, String prodDescription, int productSize,
			String productColor) {
		super(prodName, prodPrice, prodDescription);
		this.productSize = productSize;
		this.productColor = productColor;
	}

	@Override
	public void productInfo() {
		System.out.println("Product Name : " + prodName);
		System.out.println("Product Price : " + prodPrice);
		System.out.println("Product Description : " + prodDescription);
		System.out.println("Product Size : " + productSize);
		System.out.println("Product Color : " + productColor);
		System.out.println();
	}

	public int getProductSize() {
		return productSize;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductSize(int productSize) {
		this.productSize = productSize;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	
}