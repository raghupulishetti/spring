package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.bean.DemoBean;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new 
				ClassPathXmlApplicationContext(new String[] {"applicationContext1.xml"});
		DemoBean demoBean = (DemoBean) ctx.getBean("db");
		System.out.println(demoBean.getTb());

	}

}
