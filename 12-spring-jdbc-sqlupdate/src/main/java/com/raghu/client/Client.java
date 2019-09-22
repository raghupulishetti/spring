package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raghu.config.ApplicationConfig;
import com.raghu.dao.EmployeeDao;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
		System.out.println(employeeDao.updateEmployeeName(2, "Ramu"));
		System.out.println(employeeDao.deleteEmployee(102));
	}

}
