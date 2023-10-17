package com.prowings.oops.online_shopping_system;

interface ShoppingCart{

	public void addToCart(Product product);
	public void removeFromCart(Product product);
	public void showCart();
	public double checkOut();
}