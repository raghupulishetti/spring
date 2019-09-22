package com.raghu.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;

import com.raghu.bean.Employee;
import com.raghu.config.ApplicationConfig;
import com.raghu.dao.EmployeeDao;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
		try {
		Employee employee = employeeDao.getEmployee(12);
		System.out.println(employee.getEmpno()+" "+employee.getEmpno()+" "+employee.getSalary());
		}catch (EmptyResultDataAccessException e) {
			System.out.println("Employee Not found.");
		}
		
		List<Employee> employees = employeeDao.getAllEmployees();
		for(Employee e:employees) {
			System.out.println(e.getEmpno()+"==="+e.getName());
		}
		
	}

}
