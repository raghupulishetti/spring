package com.raghu.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.raghu.bean.service.ServiceBean;

public class ParentChildClient {

	public static void main(String[] args) {
		Resource parentResource = new ClassPathResource("dao-beans.xml");
		BeanFactory parentFactory = new XmlBeanFactory(parentResource);
		Resource childResource = new ClassPathResource("service-beans.xml");
		BeanFactory childFactory = new XmlBeanFactory(childResource, parentFactory);
		ServiceBean servicebean = childFactory.getBean("serviceBean", ServiceBean.class);
		servicebean.serviceMethod();
	}
}
