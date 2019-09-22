package com.raghu.bean.service;

import com.raghu.bean.Employee;
import com.raghu.bean.dao.EmployeeDAO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO employeeDao;

	public void setEmployeeDao(EmployeeDAO employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public Employee searchEmployee(int empNo) {
		Employee emp = employeeDao.searchEmployee(empNo);
		return emp;

	}

}
