package com.raghu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("studentService")
public class StudentServiceImpl {

	@Autowired
	StudentDaoImpl studentDao;

	public String findStudentById(Long id) {
		return studentDao.findStudentById(id);
	}
}
