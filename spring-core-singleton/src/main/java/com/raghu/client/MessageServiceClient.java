package com.raghu.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.raghu.bean.MessageService;
import com.raghu.bean.MessageServiceImpl;

public class MessageServiceClient {

	public static void main(String[] args) {
		//location of spring configuration file
		Resource res=new ClassPathResource("applicationContext.xml");
		//activation of spring container & then it reads spring configuration file
		BeanFactory factory=new XmlBeanFactory(res);
		//requesting object of a bean class by using its identification name
		MessageService messageService=(MessageService)factory.getBean("messageService");
		MessageServiceImpl messageService1=(MessageServiceImpl)factory.getBean("messageService");
		MessageService messageService2=(MessageService)factory.getBean("messageService");
		//calling business logic method
		System.out.println(messageService.hashCode());
		System.out.println(messageService1.hashCode());
		System.out.println(messageService2.hashCode());

	}

}
