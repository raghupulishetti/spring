package com.raghu.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int getDeptNo(int empno) {
		return jdbcTemplate.queryForInt("select deptno from employee where empno="+empno);
		//handle EmptyResultDataAccessException and show no records found message to client.
	}

	@Override
	public String getName(int empno) {
		return jdbcTemplate.queryForObject("select name from employee where empno="+empno, String.class);
	}

	@Override
	public double getSalary(int empno) {
		return jdbcTemplate.queryForObject("select salary from employee where empno=?", Double.class,empno);
	}

	@Override
	public Map<String, Object> getEmployee(int empno) {
		return jdbcTemplate.queryForMap("select name,deptno,salary from employee where empno=?", empno);
	}

	@Override
	public List<Map<String, Object>> getEmployees() {
		return jdbcTemplate.queryForList("select empno, deptno, salary from employee");
	}

}
