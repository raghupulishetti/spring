package com.raghu.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.raghu.exception.EmployeeNotFoundException;

@Controller
public class EmployeeController {
	@RequestMapping(value = "/emp", method = RequestMethod.GET)
	public String getEmployee(@RequestParam("id") int id, Model model) throws Exception {
		if (id == 1) {
			throw new EmployeeNotFoundException(id);
		} else if (id == 2) {
			throw new SQLException("SQLException, id=" + id);
		} else if (id == 3) {
			throw new IOException("IOException, id=" + id);
		} else if (id == 4) {
			throw new NullPointerException("IOException, id=" + id);
		} else {
			throw new Exception("Generic Exception, id=" + id);
		}

	}

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ModelAndView handleEmployeeNotFoundException(HttpServletRequest request, Exception ex) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("exception", ex);
		modelAndView.addObject("url", request.getRequestURL());

		modelAndView.setViewName("error");
		return modelAndView;
	}
}
