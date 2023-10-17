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
		shoppingCart.add(product);
	}
	
	@Override
	public void removeFromCart(Product product){
		shoppingCart.remove(product);
	}
	
	@Override
	public void showCart(){
		System.out.println("Products in the Shopping Cart : ");
		for(Product product : shoppingCart)
			product.productInfo();
	}

	@Override
	public double checkOut(){
		double finalPrice = 0;
		for(Product product : shoppingCart){
			finalPrice += product.getProductPrice();
		}
		return finalPrice;
	}

}
