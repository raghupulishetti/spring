package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.bean.Person;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Person parentBean = context.getBean("parentPersonBean", Person.class);
		//System.out.println(parentBean);
		System.out.println("----------------");
		Person childPersonBean1 = context.getBean("childPersonBean1", Person.class);
		Person childPersonBean2 = context.getBean("childPersonBean2", Person.class);
		System.out.println(childPersonBean1);
		System.out.println("----------------");
		System.out.println(childPersonBean2);

	}

}
