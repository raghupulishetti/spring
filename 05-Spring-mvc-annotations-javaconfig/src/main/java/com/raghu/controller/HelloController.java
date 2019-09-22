package com.raghu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.raghu.service.HelloService;

@Controller
public class HelloController {
	@Autowired
	private HelloService helloService;

	@GetMapping(value="/") // included in 4.3
	public String welcomePage() {
		return "index";
	}
	
	@PostMapping(value = "/hello") // included in 4.3
	public ModelAndView sayHello(@RequestParam("name") String name) {
		String message = null;
		String targetView = "hello";
		if (name != null && name.trim().length() > 0) {
			message = helloService.sayHello(name);
		} else {
			message = helloService.sayHello("Guest");
		}
		return new ModelAndView(targetView, "msg", message);
	}
}
