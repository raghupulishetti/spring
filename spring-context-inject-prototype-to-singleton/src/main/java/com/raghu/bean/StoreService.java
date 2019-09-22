package com.raghu.bean;

public class StoreService {

	
	public StoreService() {
		System.out.println("StoreService() constructor..");
	}

	ShoppingCart shoppingCart;

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

}
