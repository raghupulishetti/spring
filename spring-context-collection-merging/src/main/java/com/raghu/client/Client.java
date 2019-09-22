package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.bean.Course;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Course pc = (Course) ctx.getBean("parentCourse");
		System.out.println(pc.getSubjects());
		Course course = (Course) ctx.getBean("childCourse");
		// calling business logic method
		System.out.println(course.getSubjects());

	}

}
