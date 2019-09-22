package com.raghu.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.raghu.config.ApplicationConfig;
import com.raghu.dao.UserDao;
import com.raghu.entity.User;

public class UserController {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		UserDao userDao = (UserDao) ctx.getBean("userDao");
		User user = new User();
		user.setFirstName("Raghu");
		user.setLastName("Ram");
		user.setEmail("shravan@gmail.com");
		user.setMobile("9888654236");
		// System.out.println(userDao.createUser(user));
		List<User> users = userDao.getAllUsers();
		/*for (User u : users) {
			System.out.println(u);
		}*/

	}

}
