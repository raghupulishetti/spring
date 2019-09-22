package com.raghu.client;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class I18nAppClient {

	public static void main(String args[]) throws Exception {
		Locale l = new Locale("en","uk");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		String msg = ctx.getMessage("str1", new String[] { "hi", "Sai" }, "default msg", l);
		msg += " \n" + ctx.getMessage("str2", null, "default msg", l);
		msg += " \n" + ctx.getMessage("str3", null, "default msg", l);
		msg += " \n" + ctx.getMessage("str4", null, "default msg", l);
		System.out.println("Message is: " + msg);
	}

}
