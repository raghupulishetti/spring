package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raghu.bean.Employee;
import com.raghu.config.ApplicationConfig;
import com.raghu.dao.EmployeeDaoImpl;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeDaoImpl employeeDao = context.getBean("employeeDao", EmployeeDaoImpl.class);
		Employee e = new Employee();
		e.setEmpno(102);
		e.setName("Sathish");
		e.setSalary(102.032);
		int count = employeeDao.createEmployee(e);
		System.out.println(count);
	}

}
