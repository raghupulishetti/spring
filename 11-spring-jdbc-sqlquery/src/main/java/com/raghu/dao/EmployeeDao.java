package com.raghu.dao;

import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Repository;

import com.raghu.bean.Employee;
import com.raghu.bean.EmployeeMappingSqlQuery;

@Repository("employeeDao")
public class EmployeeDao {
	private DataSource dataSource;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Employee> getAllEmployees() {
		String sql = "select *from employee";
		EmployeeMappingSqlQuery sqlQuery = 
				new EmployeeMappingSqlQuery(dataSource, sql);
		List<Employee> list = sqlQuery.execute();
		return list;
	}

	public Employee getEmployee(int eno) {
		Employee emp = null;
		String sql = "select *from employee where empno=?";
		EmployeeMappingSqlQuery sqlQuery = 
				new EmployeeMappingSqlQuery(dataSource, sql);
		sqlQuery.declareParameter(new SqlParameter("empno", Types.INTEGER));
		List<Employee> list = sqlQuery.execute(eno);
		if (list.size() > 0) {
			emp = list.get(0);
		}
		return emp;
	}

}
