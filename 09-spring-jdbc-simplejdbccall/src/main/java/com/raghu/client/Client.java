package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raghu.bean.Student;
import com.raghu.config.ApplicationConfig;
import com.raghu.dao.StudentDAOImpl;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		StudentDAOImpl sd = context.getBean("studentDAOImpl", StudentDAOImpl.class);
		Student s = sd.getStudent(1);
		System.out.println( s.getName() + "=====" + s.getAge());
	}
}
