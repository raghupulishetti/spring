package com.raghu.client;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raghu.config.ApplicationConfig;
import com.raghu.dao.EmployeeDao;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		EmployeeDao employeeDao = context.getBean("employeeDao", EmployeeDao.class);
		System.out.println("Testing of getAllEmployees() ");
		List<Map<String, Object>> list = employeeDao.getEmployees();
		for (Map<String, Object> map1 : list) {
			Set<String> keys = map1.keySet();
			for (String key : keys) {
				Object value = map1.get(key);
				System.out.println(key + "=" + value);
			}
			System.out.println("-------------");
		}
		System.out.println("-------------------");
		System.out.println("Testing of getEmployee(1) ");
		Map<String, Object> map2 = employeeDao.getEmployee(1);
		Set<Entry<String, Object>> set = map2.entrySet();
		for (Entry<String, Object> entry : set) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		System.out.println("-------------------");
		System.out.println("Testing of getName(1) ");
		System.out.println(employeeDao.getName(1));
		System.out.println("-------------------");
		System.out.println("Testing of getDeptNo(2) ");
		System.out.println(employeeDao.getDeptNo(2));
		System.out.println("-------------------");
		System.out.println("Testing of getSalary(2) ");
		System.out.println(employeeDao.getSalary(2));
	}

}
