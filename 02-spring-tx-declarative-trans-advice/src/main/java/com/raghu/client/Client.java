package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.dao.ProductDao;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductDao buy = (ProductDao) context.getBean("productDao");
		buy.buyProduct("user1", 101);
		buy.displayState("user1", 101);
		buy.buyProduct("user2", 102);
		buy.displayState("user2", 102);
	}

}
