package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.bean.Employee;
import com.raghu.bean.service.EmployeeService;

public class EmployeeController {

	public static void main(String[] args) throws InterruptedException {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeService empService = (EmployeeService) context.getBean("employeeService");
		System.out.println("Testing of searchEmployee(-) :");
		Employee emp = empService.searchEmployee(1004);
		if (emp != null) {
			System.out.println("Emp No :" + emp.getEmpNo());
			System.out.println("Name :" + emp.getName());
			System.out.println("Salary :" + emp.getSalary());

		} else {
			System.out.println("Emp Not Found");
		}

	}

}
