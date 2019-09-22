package com.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.raghu.service.HelloService;

@Controller
public class HelloController {
	@Autowired
	private HelloService helloService;

	@RequestMapping(value = "hello", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public ModelAndView sayHello(@RequestParam("name") String name) {
		String message = null;
		String targetView = "/WEB-INF/pages/hello.jsp";
		if (name != null && name.trim().length() > 0) {
			message = helloService.sayHello(name);
		} else {
			message = helloService.sayHello("Guest");
		}
		return new ModelAndView(targetView, "msg", message);
	}
}
