package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.bean.Employee;
import com.raghu.bean.Person;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person childPersonBean1 = context.getBean("childPersonBean1", Person.class);
		Person childPersonBean2 = context.getBean("childPersonBean2", Person.class);
		Employee childEmployeeBean = context.getBean("childEmployeeBean", Employee.class);
		System.out.println(childPersonBean1);
		System.out.println("----------------");
		System.out.println(childPersonBean2);
		System.out.println("----------------");
		System.out.println(childEmployeeBean);

	}

}
