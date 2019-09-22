package com.raghu.bean;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

public class DatabaseServiceImpl implements DatabaseService {
	private DataSource datasource;

	public DatabaseServiceImpl() {
		System.out.println("Consteructor executed.");
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public void printDetails() throws SQLException {
		Connection con = datasource.getConnection();
		DatabaseMetaData dbmd = con.getMetaData();
		System.out.println(dbmd.getDatabaseProductVersion());

	}

}
