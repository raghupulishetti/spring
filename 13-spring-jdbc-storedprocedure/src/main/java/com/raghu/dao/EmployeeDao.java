package com.raghu.dao;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raghu.bean.MyStoredProcedure;

@Repository("employeeDao")
public class EmployeeDao {
	@Autowired
	private DataSource dataSource;

	public void getEmployeeDetails(final int empno) {
		String procedure = "GETEMPLOYEEDETAILS";
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("eno", empno);
		MyStoredProcedure storedProcedure = new MyStoredProcedure(dataSource, procedure);
		Map<String, Object> resultMap = storedProcedure.execute(paramMap);
		System.out.println(resultMap);
	}

}
