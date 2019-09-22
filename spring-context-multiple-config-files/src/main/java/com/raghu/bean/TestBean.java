package com.raghu.bean;

public class TestBean {
	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "TestBean [msg=" + msg + "]";
	}

}
