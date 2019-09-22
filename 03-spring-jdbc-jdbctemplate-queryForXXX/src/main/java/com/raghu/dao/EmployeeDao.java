package com.raghu.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {
	int getDeptNo(int empno);
	String getName(int empno);
	double getSalary(int empno);
	Map<String, Object> getEmployee(int empno);
	List<Map<String, Object>> getEmployees();
}
