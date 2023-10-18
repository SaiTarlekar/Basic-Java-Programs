package com.prowings.oops.online_shopping_system;

import java.util.List;
import java.util.ArrayList;

class Customer implements ShoppingCart{
	private String name;
	private String emailId;
	List<Product> shoppingCart;

	public Customer(){}

	public Customer(String name, String emailId){
		this.name = name;
		this.emailId = emailId;
		shoppingCart = new ArrayList<>();
	}

	public String toString() {
		return "\nName     : "+name+""
			 + "\nEmail Id : "+emailId;
	}
	
	public String getCustName(){
		return name;
	}

	public String getCustEmailId(){
		return emailId;
	}

	public void setCustName(String name){
		this.name = name;
	}

	public void setCustEmailId(String emailId){
		this.emailId = emailId;
	}

	@Override
	public void addToCart(Product product){
		try {
			if(product == null)
				throw new IllegalArgumentException("Product not Selected Properly.");
			else if(Store.isproductAvailable(product)) 
				shoppingCart.add(product);
			else
				System.out.println("Product not available");
		}
		catch(Exception e) {
			System.err.println("Error : " +e.getMessage());
			System.exit(1);
		}
	}
	
	@Override
	public void removeFromCart(Product product){
		
		try {
			if(product == null)
				throw new IllegalArgumentException("Product not Selected Properly.");
			else if(Store.isproductAvailable(product)) 
				shoppingCart.remove(product);
			else
				System.out.println("Product not available");
		}
		catch(Exception e) {
			System.err.println("Error : " +e.getMessage());
			System.exit(1);
		}
	}
	
	@Override
	public void showCart(){
		System.out.println("\nProducts in the Shopping Cart : ");
		for(Product product : shoppingCart)
			product.productInfo();
	}

	@Override
	public double checkOut(){
		double finalPrice = 0;
		
		if(shoppingCart.size() > 0) {
			for(Product product : shoppingCart){
				finalPrice += product.getProductPrice();
			}
		}
		else {
			System.out.println("Shopping Cart is Empty");
		}
		return finalPrice;
	}

}
