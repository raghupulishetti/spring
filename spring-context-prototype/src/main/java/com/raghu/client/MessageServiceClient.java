package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.bean.MessageService;
import com.raghu.bean.MessageServiceImpl;

public class MessageServiceClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageService messageService = (MessageService) ctx.getBean("messageService");
		MessageServiceImpl messageService1 = (MessageServiceImpl) ctx.getBean("messageService");
		MessageService messageService2 = (MessageService) ctx.getBean("messageService");
		// calling business logic method
		System.out.println(messageService.hashCode());
		System.out.println(messageService1.hashCode());
		System.out.println(messageService2.hashCode());
	}

}
