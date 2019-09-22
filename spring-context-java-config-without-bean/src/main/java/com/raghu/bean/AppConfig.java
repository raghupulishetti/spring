package com.raghu.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = { "com.raghu.bean" })
public class AppConfig {
	/*@Bean
	DriverManagerDataSource dataSource(@Value("${db.driverClassName}") String driverClass,
			@Value("${db.url}") String url, @Value("${db.username}") String uname,
			@Value("${db.password}") String password) {
		DriverManagerDataSource ds = new DriverManagerDataSource(url, uname, password);
		ds.setDriverClassName(driverClass);
		return ds;
	}*/

}
