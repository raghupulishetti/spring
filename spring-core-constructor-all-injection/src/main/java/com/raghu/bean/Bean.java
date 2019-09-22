package com.raghu.bean;

public class Bean {
	private int a;
	private float b;
	private String c;

	public Bean() {
	}

	public Bean(int a, float b, String c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String toString() {
		return a + " " + b + " " + c;
	}
}
