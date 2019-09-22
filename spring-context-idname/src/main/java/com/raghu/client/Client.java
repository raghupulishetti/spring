package com.raghu.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.raghu.bean.IdBean;
import com.raghu.bean.NameBean;

public class Client {

	public static void main(String[] args) {
		ApplicationContext  ctx = new ClassPathXmlApplicationContext(new String[] {"idbeans.xml","namebeans.xml"});
		IdBean idBean = ctx.getBean("iBean", IdBean.class);
		//NameBean nameBean = factory.getBean("nameBean", NameBean.class);
	}

}
