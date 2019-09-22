package com.raghu.bean;

import java.util.Calendar;

public class DemoBean implements DemoInter {
	private Calendar cl = null;
	private TestBean tb = null;

	public DemoBean() {
	}

	public void setCl(Calendar cl) {
		this.cl = cl;
	}

	public void setTb(TestBean tb) {
		this.tb = tb;
	}

	public String sayHello() {
		return "tb = " + tb.toString() + " cl = " + cl.toString();
	}
}
