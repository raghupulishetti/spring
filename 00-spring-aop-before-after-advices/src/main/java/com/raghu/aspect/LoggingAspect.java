package com.raghu.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.raghu.bean.Email;

@Aspect
public class LoggingAspect {

	@Pointcut("execution(* com.raghu.bean.*.send*(..))")
	public void pointcut() {

	}

	@Pointcut("args(email))")
	public void pointcutEmail(Email email) {

	}

	@Before("pointcut()")
	public void beforeAdvice(JoinPoint jp) {
		System.out.println("Before advice method." + jp.getSignature());
	}

	@After("pointcut()")
	public void afterAdvice() {
		System.out.println("After advice method.");
	}

	// @After("pointcut() && pointcutEmail(email)")
	@After("execution(* com.raghu.bean.*.send*(..))&&args(email)")
	public void afterAdvice(Email email) {
		System.out.println("After advice method with email as argument." + email.getFrom());
	}


	

}
