package com.raghu.bean;

public class Student {
	private int regno;
	private String name, course;
	private float fees;

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public void displayStudentDetails() {
		System.out.println("Reg No:" + regno);
		System.out.println("Name :" + name);
		System.out.println("Course :" + course);
		System.out.println("Fees :" + fees);
	}

}
