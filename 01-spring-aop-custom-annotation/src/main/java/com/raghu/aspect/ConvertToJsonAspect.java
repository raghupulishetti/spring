package com.raghu.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Component
@Aspect
public class ConvertToJsonAspect {

	@Pointcut("@annotation(com.raghu.bean.ConvertToJson)")
	public void pointcut() {
		
	}
	
	@AfterReturning(pointcut = "pointcut()", returning="users")
	public void afterReturning(JoinPoint jp,List<?> users) throws JsonProcessingException {
		System.out.println("afterReturning advice method");
		ObjectMapper objectMapper = new ObjectMapper();
    	//Set pretty printing of json
    	objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    	String json = objectMapper.writeValueAsString(users);
    	System.out.println(json);
	}
	
	
}
