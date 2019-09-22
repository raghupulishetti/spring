package com.raghu.dao;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl {
	@Autowired
	private DataSource dataSource;

	public void registerStudent(String name, int age) {

		SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("Student");
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("name", name);
		parameters.put("age", age);
		
		//parameters.put("name", "Sachin");
		//parameters.put("age", 50);
		int count = jdbcInsert.execute(parameters);
		System.out.println("updated rows count=="+count);

	}

}
