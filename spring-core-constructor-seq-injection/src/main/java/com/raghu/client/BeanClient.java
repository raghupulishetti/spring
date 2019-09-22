package com.raghu.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.raghu.bean.Bean;

public class BeanClient {

	public static void main(String[] args) {
		// location of spring configuration file
		Resource res = new ClassPathResource("applicationContext.xml");
		// activation of spring container & then it reads spring configuration file
		BeanFactory factory = new XmlBeanFactory(res);
		// requesting object of a bean class by using its identification name
		Bean bean = (Bean) factory.getBean("be");

		System.out.println(bean);
	}

}
