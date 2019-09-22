package com.raghu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.raghu.bean.Employee;

@Repository("employeeDao")
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Employee> getAllEmployees() {
		String sql = "select empno,name,salary from employee ";
		return jdbcTemplate.query(sql, new EmployeeResultSetExtractor());
	}

	public List<Employee> getAllEmployees(double salary) {
		String sql = "select empno,name,salary from employee where salary>=?";
		return jdbcTemplate.query(sql, new EmployeeResultSetExtractor(), salary);

	}

	public Employee getEmployee(int empNo) {
		String sql = "select empno,name,salary from employee where salary>=?";
		return jdbcTemplate.query(sql, (ResultSet rs) -> {
			Employee emp = null;
			if (rs.next()) {
				emp = new Employee();
				emp.setEmpno(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
			}
			return emp;
		}, empNo);
	}

	private class EmployeeResultSetExtractor implements ResultSetExtractor<List<Employee>> {
		public List<Employee> extractData(ResultSet rs) throws SQLException {
			List<Employee> list = new ArrayList<>();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpno(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				list.add(emp);
			}
			return list;
		}

	}

}
