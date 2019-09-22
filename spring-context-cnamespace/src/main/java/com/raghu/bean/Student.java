package com.raghu.bean;

public class Student {
	private String name;
	private int age;
	private Course course;

    Student(String name, int age, Course course){
        this.name = name;
        this.age = age;
        this.course = course;
    }


	public void displayInfo() {

		System.out.println("Student Name : " + name);
		System.out.println("Student Age : " + age);
		System.out.println("Course name : " + course.getCourseName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
