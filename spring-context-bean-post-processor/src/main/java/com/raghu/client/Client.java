package com.raghu.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.bean.Cashier;
import com.raghu.bean.ShoppingCart;

public class Client {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		ShoppingCart shoppingCart = (ShoppingCart) factory.getBean("shoppingCart");
		Cashier cashier = (Cashier) factory.getBean("cashier");
		cashier.calculateTotalPrice(shoppingCart);
		factory.close();
	}

}
