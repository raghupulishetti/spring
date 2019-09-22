package com.raghu.bean;

public class TestBean {
	String msg;

	public TestBean() {
	} // dummy constructor

	TestBean(String msg) {
		this.msg = msg;
		System.out.println("Constructor of TestBean class invoked");
	}

	public String toString() // to dispaly results
	{
		return msg;
	}

}
