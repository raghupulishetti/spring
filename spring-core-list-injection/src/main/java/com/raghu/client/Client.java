package com.raghu.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.raghu.bean.College;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		// location of spring configuration file
		Resource res = new ClassPathResource("applicationContext.xml");
		// activation of spring container & then it reads spring configuration file
		BeanFactory factory = new XmlBeanFactory(res);
		College college = factory.getBean("college", College.class);
		System.out.println(college.getCourses());

	}

}
