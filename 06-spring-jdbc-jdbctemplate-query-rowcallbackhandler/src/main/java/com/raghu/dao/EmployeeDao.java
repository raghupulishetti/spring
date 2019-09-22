package com.raghu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.raghu.bean.Employee;

@Repository("employeeDao")
public class EmployeeDao {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Employee> getAllEmployeeDetails() {
		final List<Employee> list = new ArrayList<Employee>();
		String sql = "select * from employee ";
		jdbcTemplate.query(sql, new RowCallbackHandler() {
			public void processRow(ResultSet rs) throws SQLException, DataAccessException {
				do {
					Employee emp = new Employee();
					emp.setEmpno(rs.getInt("empno"));
					emp.setName(rs.getString("name"));
					emp.setDeptno(rs.getInt("deptno"));
					emp.setSalary(rs.getDouble("salary"));
					list.add(emp);
				} while (rs.next());
			}// end of processRow()
		});
		return list;
	}// end of getAllEmpolyeeDetails
}// end of EmployeeDAO-class
