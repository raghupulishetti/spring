package com.raghu.bean;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.object.MappingSqlQuery;

public class EmployeeMappingSqlQuery extends MappingSqlQuery<Employee> {
	public EmployeeMappingSqlQuery(DataSource ds, String sql) {
		super(ds, sql);
	}

	public Employee mapRow(ResultSet rs, int rowNumber) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpno(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setDeptno(rs.getInt(3));	
		emp.setSalary(rs.getDouble(4));
		return emp;
	}
}
