package com.prowings.oops.online_shopping_system;

import java.util.ArrayList;
import java.util.List;

class Store{
	private static List<Product> availableProducts;


	public Store(){
		this.availableProducts = new ArrayList<>();
	}

	public void addProducts(Product product){
		availableProducts.add(product);
	}

	public void showProducts(){
		System.out.println("Available Products in the Store are : ");
		for(Product product : availableProducts)
			product.productInfo();
	}
	
	public static boolean isproductAvailable(Product product) {
		
		return availableProducts.contains(product);
	}

}
