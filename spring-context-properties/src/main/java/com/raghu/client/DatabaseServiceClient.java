package com.raghu.client;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.bean.DatabaseService;

public class DatabaseServiceClient {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DatabaseService databaseService = (DatabaseService) ctx.getBean("databaseService");
		// calling business logic method
		databaseService.printDetails();

	}

}
