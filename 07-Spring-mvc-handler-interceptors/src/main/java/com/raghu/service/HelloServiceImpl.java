package com.raghu.service;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		String message = "";
		if (name != null && name.trim().length() > 0) {
			message = "Hello " + name + " welcome to spring MVC";
		} else {
			message = "Hello Guest welcome to spring MVC";
		}
		return message;
	}

}
