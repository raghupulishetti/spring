package com.raghu.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.raghu.bean.User;
import com.raghu.service.UserService;

public class UserController {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		// calling business logic method
		User user = new User();
		user.setUserId(1001);
		user.setName("Shravan");
		user.setEmail("shravan@gmail.com");
		user.setMobile("9888654236");
		//System.out.println(userService.registerUser(user));

		//System.out.println(userService.updateUserMobile(1001, "9999999999"));
		System.out.println(userService.deleteUser(1001));

	}

}


