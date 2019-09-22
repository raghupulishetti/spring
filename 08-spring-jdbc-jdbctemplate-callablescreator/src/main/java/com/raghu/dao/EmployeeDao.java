package com.raghu.dao;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Repository;

import com.raghu.bean.MyCallableStatementCreator;

@Repository("employeeDao")
public class EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void getEmployeeDetails(int empno) {
		List<SqlParameter> list = new ArrayList<SqlParameter>();
		list.add(new SqlParameter("eno", Types.INTEGER));
		list.add(new SqlOutParameter("ename", Types.VARCHAR));
		list.add(new SqlOutParameter("esalary", Types.DOUBLE));
		MyCallableStatementCreator mcsc = new MyCallableStatementCreator(empno);
		Map<String, Object> results = jdbcTemplate.call(mcsc, list);
		System.out.println("results :" + results);
	}

}
