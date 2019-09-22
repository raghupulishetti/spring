package com.raghu.bean;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.springframework.jdbc.core.CallableStatementCreator;

public class MyCallableStatementCreator implements CallableStatementCreator {

	private int eno;

	public MyCallableStatementCreator(int eno) {
		this.eno = eno;
	}

	public CallableStatement createCallableStatement(Connection con) throws SQLException {
		CallableStatement cst = con.prepareCall("{call GETEMPLOYEEDETAILS(?,?,?)}");
		cst.setInt(1, eno);
		cst.registerOutParameter(2, Types.VARCHAR);
		cst.registerOutParameter(3, Types.DECIMAL);
		return cst;
	}

}
