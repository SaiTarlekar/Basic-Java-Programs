package com.prowings.oops.online_shopping_system;

public class ECommerceApp {

	public ECommerceApp() {}

	public static void main(String[] args) {
		Store store = new Store();
		
		Product earphones = new ElectronicProd("Boat Headphones", 2000, "Over Ear, "
				+ "Dual Connectivity", "1 Year");
		
		Product laptop = new ElectronicProd("High-performance Laptop", 50000, 
				"Powerful laptop with a large display", "2-year warranty");
		
		Product smartphone = new ElectronicProd("Smartphone", 20000, 
				"Latest smartphone with high-resolution camera", "1-year warranty");


		Product jeans = new ClothingProd("Jeans", 800, "Jeans", 38, "black");
		
		Product tShirt = new ClothingProd("T-shirt", 400, "Casual cotton T-shirt", 40, "White");
		
		Product shirt = new ClothingProd("Shirt", 600, "Cotton Shirt", 38, "Light Blue");

		
		store.addProducts(earphones);
		store.addProducts(smartphone);
		store.addProducts(laptop);

		store.addProducts(jeans);
		store.addProducts(shirt);
		store.addProducts(tShirt);
		
		Customer person1 = new Customer("Sai Tarlekar", "starlekar1@gmail.com");
		
		person1.addToCart(shirt);
		person1.addToCart(laptop);
		person1.addToCart(earphones);
		
		person1.showCart();
		System.out.println(person1.checkOut());
		
//		person1.removeFromCart(jeans);
//		
//		person1.showCart();
//		System.out.println(person1.checkOut());
	}

}
