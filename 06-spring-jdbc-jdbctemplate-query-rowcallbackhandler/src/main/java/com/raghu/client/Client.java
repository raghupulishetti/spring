package com.raghu.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raghu.bean.Employee;
import com.raghu.config.ApplicationConfig;
import com.raghu.dao.EmployeeDao;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
		List<Employee> employees = employeeDao.getAllEmployeeDetails();
		for (Employee e : employees) {
			System.out.println(e.getEmpno()+"===="+e.getName()+"==="+e.getSalary());
		}

	}

}
