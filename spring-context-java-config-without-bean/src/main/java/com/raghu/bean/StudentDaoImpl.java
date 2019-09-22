package com.raghu.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("studentDao")
public class StudentDaoImpl {
	public static Map<Long, String> students = new HashMap<Long, String>();
	static {
		students.put(1l, "Raghu");
		students.put(2l, "Ramu");
		students.put(3l, "Radhika");
		students.put(4l, "Sindu");
		students.put(5l, "Sravan");
		students.put(6l, "Ravi");
	}

	public String findStudentById(Long id) {
		return students.get(id);
	}
}
