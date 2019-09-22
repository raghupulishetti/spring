package com.raghu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.raghu.bean.Employee;

@Repository("employeeDao")
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Employee> getAllEmployees() {
		String sql = "select empno,name,salary from employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> list = jdbcTemplate.query(sql, rowMapper);
		return list;
	}

	public List<Employee> getAllEmployees(double salary) {
		String sql = "select empno,name,salary from employee where salary>=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> list = jdbcTemplate.query(sql, rowMapper, salary);
		return list;
	}

	public Employee getEmployee(int empNo) {
		String sql = "select empno,name,salary from employee where empNo=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee emp = jdbcTemplate.queryForObject(sql, rowMapper, empNo);
		return emp;
	}

	private class EmployeeRowMapper implements RowMapper<Employee> {
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();
			emp.setEmpno(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getDouble(3));
			return emp;
		}
	}

}
