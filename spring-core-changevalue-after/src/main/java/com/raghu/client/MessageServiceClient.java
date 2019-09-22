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
		MessageServiceImpl messageService=(MessageServiceImpl)factory.getBean("messageService");
		messageService.sendMessage("raghu@gmail.com");
		messageService.setMessage("Hey, Changed the email content");
		
		MessageServiceImpl messageService1 =(MessageServiceImpl)factory.getBean("messageService");
		messageService1.sendMessage("raghu@gmail.com");
	}

}
