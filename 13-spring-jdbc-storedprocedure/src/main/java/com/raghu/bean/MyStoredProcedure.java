package com.raghu.bean;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.StoredProcedure;

public class MyStoredProcedure extends StoredProcedure {
	public MyStoredProcedure(DataSource dataSource, String procedure) {
		super(dataSource, procedure);
		declareParameter(new SqlParameter("eno", Types.BIGINT));
		declareParameter(new SqlOutParameter("ename", Types.VARCHAR));
		declareParameter(new SqlOutParameter("esalary", Types.INTEGER));
		compile();
	}

}
