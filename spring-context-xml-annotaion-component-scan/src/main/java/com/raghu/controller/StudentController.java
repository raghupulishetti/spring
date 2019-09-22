package com.raghu.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.bean.StudentServiceImpl;

public class StudentController {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentServiceImpl studentService = (StudentServiceImpl) ctx.getBean("studentService");
		// calling business logic method
		System.out.println(studentService.findStudentById(1l));
		
		System.out.println(studentService.findStudentById(5l));

	}

}
