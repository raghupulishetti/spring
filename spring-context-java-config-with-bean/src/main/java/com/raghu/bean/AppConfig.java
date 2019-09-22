package com.raghu.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name = "studentDao")
	public StudentDaoImpl getStudentDaoImpl() {
		return new StudentDaoImpl();
	}

	@Bean(name = "studentService")
	public StudentServiceImpl getStudentServiceImpl() {
		return new StudentServiceImpl();
	}
}
