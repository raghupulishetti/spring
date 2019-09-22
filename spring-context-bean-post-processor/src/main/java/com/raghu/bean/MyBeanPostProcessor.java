package com.raghu.bean;

import java.io.File;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
	public Object postProcessAfterInitialization(Object beanObject, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization() ::" + beanName);

		return beanObject;
	}

	public Object postProcessBeforeInitialization(Object beanObject, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization() ::" + beanName);
		if (beanObject instanceof Cashier) {
			Cashier cashier = (Cashier) beanObject;
			String directory = cashier.getFilePath();
			File file = new File(directory);
			boolean b = file.mkdirs();
			if (b == true) {
				System.out.println("Directory is created ::" + directory);
			} else {
				System.out.println("Directory is already existed ");
			}
		}
		return beanObject;
	}
}
