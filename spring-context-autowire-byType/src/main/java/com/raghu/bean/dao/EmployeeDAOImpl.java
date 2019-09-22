package com.raghu.bean.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.raghu.bean.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public Employee searchEmployee(int empNo) {
		Employee emp = null;
		Connection con = null;
		try {
			con = dataSource.getConnection();
			String sql = "select *from employee where empNo=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, empNo);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				emp = new Employee();
				emp.setEmpNo(rs.getInt("empNo"));
				emp.setName(rs.getString("name"));
				emp.setSalary(rs.getDouble("salary"));
			}

		} catch (SQLException sqlException) {
			System.out.println(
					"Exception Occured while searching Employee() ::" + sqlException.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException sqlException) {
					System.out.println("Exception OCcured while closing the connection ::" + sqlException.getMessage());
				}
			}
		}
		return emp;
	}

}
