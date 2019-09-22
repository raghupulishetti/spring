package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raghu.config.ApplicationConfig;
import com.raghu.dao.UserDao;
import com.raghu.entity.User;

public class UserController {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		UserDao userDao = (UserDao) ctx.getBean("userDao");
		// calling business logic method
		User user = new User();
		user.setUserId(101);
		user.setFirstName("Shravan");
		user.setLastName("Kumar");
		user.setEmail("shravan@gmail.com");
		user.setMobile("9888654236");
		//user.setAge(35);
		System.out.println(userDao.createUser(user));

	}

}
