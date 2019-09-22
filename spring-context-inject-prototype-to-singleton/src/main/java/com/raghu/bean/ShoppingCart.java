package com.raghu.bean;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	static int count = 0;
	ShoppingCart() {
		System.out.println("ShoppingCart() constructor..");
	}

	public List<String> getItems() {
		List<String> items = new ArrayList<String>();
		items.add("TV");
		items.add("Phone");
		return items;

	}

	@Override
	public int hashCode() {
		return count++;
	}
	
}
