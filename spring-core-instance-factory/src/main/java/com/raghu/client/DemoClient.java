package com.raghu.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.raghu.bean.DemoBean;
import com.raghu.bean.DemoInter;

public class DemoClient {

	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		DemoBean d1 = (DemoBean) factory.getBean("db");
		System.out.print(d1.sayHello());
	}

}
