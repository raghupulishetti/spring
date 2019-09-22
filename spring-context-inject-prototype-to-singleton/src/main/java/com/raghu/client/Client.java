package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.bean.ShoppingCart;
import com.raghu.bean.StoreService;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StoreService storeService = (StoreService) ctx.getBean("storeService");
		StoreService storeService1 = (StoreService) ctx.getBean("storeService");
		System.out.println(storeService1.getShoppingCart());
		StoreService storeService2 = (StoreService) ctx.getBean("storeService");
		/*ShoppingCart sc =  storeService.getShoppingCart();
		System.out.println(sc.getItems());
		ShoppingCart sc1 =  storeService.getShoppingCart();
		System.out.println(sc1.getItems());
		System.out.println(sc.hashCode());
		System.out.println(sc1.hashCode());*/

	}

}
