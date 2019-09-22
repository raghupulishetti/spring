package com.raghu.dao;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.raghu.bean.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
	    this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public int createEmployee(Employee emp) {
		String sql = "insert into employee(empno,name,salary) values(:eno,:name,:salary)";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("eno", emp.getEmpno());
		map.put("name", emp.getName());
		map.put("salary", emp.getSalary());
		int count = namedParameterJdbcTemplate.update(sql, map);
		return count;
	}

}
