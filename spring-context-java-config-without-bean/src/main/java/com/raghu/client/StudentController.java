package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raghu.bean.AppConfig;
import com.raghu.bean.StudentServiceImpl;

public class StudentController {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentServiceImpl studentService = (StudentServiceImpl) context.getBean("studentService");
		// calling business logic method
		System.out.println(studentService.findStudentById(1l));
		
		System.out.println(studentService.findStudentById(5l));

	}

	
}
