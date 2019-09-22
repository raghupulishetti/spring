package com.raghu.bean;

public class TestBean {
	String msg;

	public TestBean() {
	}

	private TestBean(String msg) {
		this.msg = msg;
		System.out.println("Private Constructor invoked");
	}// static factory method

	public static TestBean getTestBean(String msg) {
		System.out.println("static factory method invoked");
		return new TestBean(msg);
	}

	public String toString() { // to dispaly results
		return msg;
	}
}
