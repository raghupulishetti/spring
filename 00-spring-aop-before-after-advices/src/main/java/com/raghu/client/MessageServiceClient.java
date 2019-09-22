package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.bean.Email;
import com.raghu.bean.MessageService;

public class MessageServiceClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		MessageService messageService=(MessageService)ctx.getBean("messageService");
		//calling business logic method
		messageService.sendMessage("raghu@gmail.com");
		
		Email email  = new Email();
		email.setContent("Hey I am going to call advice...");
		email.setFrom("spring");
		messageService.sendMessage(email);
	}

}
