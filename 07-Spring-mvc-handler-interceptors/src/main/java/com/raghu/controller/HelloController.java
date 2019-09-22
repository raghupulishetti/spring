package com.raghu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.raghu.service.HelloService;

public class HelloController implements Controller {

	private HelloService helloService;

	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String message = "";
		String viewName = "welcome";
		String name = request.getParameter("name");
		message = helloService.sayHello(name);
		return new ModelAndView(viewName, "msg", message);
	}

}
