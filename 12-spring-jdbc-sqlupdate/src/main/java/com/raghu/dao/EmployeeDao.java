package com.raghu.dao;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Repository;

@Repository("employeeDao")
public class EmployeeDao {
	@Autowired
	private DataSource dataSource;

	public int updateEmployeeName(int empNo, String name) {
		String sql = "update employee set name=? where empno=?";
		SqlUpdate sqlUpdate = new SqlUpdate(dataSource, sql);
		sqlUpdate.declareParameter(new SqlParameter(Types.VARCHAR));
		sqlUpdate.declareParameter(new SqlParameter(Types.INTEGER));
		int count = sqlUpdate.update(name, empNo);
		return count;
	}

	public int deleteEmployee(int empNo) {
		String sql = "delete from employee where empno=?";
		SqlUpdate sqlUpdate = new SqlUpdate(dataSource, sql);
		sqlUpdate.declareParameter(new SqlParameter(Types.INTEGER));
		int count = sqlUpdate.update(empNo);
		return count;
	}

}
