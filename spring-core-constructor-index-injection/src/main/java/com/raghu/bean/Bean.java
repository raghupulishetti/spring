package com.raghu.bean;

public class Bean {
	private int a;
	private float b;
	private String c;
	private int d;

	public Bean() {
	}

	public Bean(int a, float b, String c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public String toString() {
		return a + " " + b + " " + c+ " " + d;
	}
}
