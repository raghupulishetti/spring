package com.raghu.bean;

import java.util.Calendar;

public class DemoBean implements DemoInter {
	private TestBean tb = null;

	public DemoBean() {
		System.out.println("zero parametrized constructor of DemoBean class");
	}

	public void setTb(TestBean tb) {
		this.tb = tb;
	}

	public String sayHello() {
		return "tb = " + tb.toString();
	}

	// instance factory method
	public TestBean getTestBean(String msg) {
		System.out.println("demo bean factory method of DemoBean class");
		return new TestBean(msg);
	}
}
