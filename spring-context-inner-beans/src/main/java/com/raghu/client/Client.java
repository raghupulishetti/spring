package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.bean.FishBean;
import com.raghu.bean.WaterBean;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		WaterBean wb = ctx.getBean("waterBean", WaterBean.class);
		FishBean fb = wb.getFishBean();
		System.out.println("Fish Name :" + fb.getFishName());
	}

}
