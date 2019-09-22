package com.raghu.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.dao.UserDao;
import com.raghu.entity.User;

public class UserController {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) ctx.getBean("userDao");
		// calling business logic method
		User user = new User();
		// user.setUserId(1001l);
		user.setName("Shravan");
		user.setEmail("shravan@gmail.com");
		user.setMobile("9888654236");
		user.setAge(35);
		//System.out.println(userDao.createUser(user));
		
		List<User> users = userDao.getUsers();
		for (User u : users) {
			System.out.println(u);
		}

	}

}


