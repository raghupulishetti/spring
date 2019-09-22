package com.raghu.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class College {
	private List<String> coursesList;
	private Set<String> coursesSet;
	private Map<String, String> coursesMap;

	public List<String> getCoursesList() {
		return coursesList;
	}

	public void setCoursesList(List<String> coursesList) {
		this.coursesList = coursesList;
	}

	public Set<String> getCoursesSet() {
		return coursesSet;
	}

	public void setCoursesSet(Set<String> coursesSet) {
		this.coursesSet = coursesSet;
	}

	public Map<String, String> getCoursesMap() {
		return coursesMap;
	}

	public void setCoursesMap(Map<String, String> coursesMap) {
		this.coursesMap = coursesMap;
	}

}
