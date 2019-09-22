package com.raghu.dao;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.raghu.bean.Student;

@Repository
public class StudentDAOImpl {
	@Autowired
	private DataSource dataSource;

	public Student getStudent(Integer id) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("get_Student_Record");

		SqlParameterSource in = new MapSqlParameterSource().addValue("sid", id);
		Map<String, Object> out = jdbcCall.execute(in);

		Student student = new Student();
		student.setId(id);
		student.setName((String) out.get("sname"));
		student.setAge((Integer) out.get("sage"));
		return student;
	}
}
