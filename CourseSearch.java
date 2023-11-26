package com.SimpliLearn.TDD;

import java.util.HashMap;
import java.util.Map;

public class CourseSearch {
	
	private Map<String, Integer> getcoursedata() {
		
		Map<String, Integer> courseMap = new HashMap<String, Integer>();
		courseMap.put("Python", 10);
		courseMap.put("SQL", 25);
		courseMap.put("Ruby", 25);
		courseMap.put("DATA ANALYTICS", 40);
		return courseMap;

	}

	public int getCourse(String course) {

		// if city is empty > provide message "city name cannot be empty
		// if city name not contains any valid key (valid city) city name does not
		// exist.
		// if we have valid city in our list then provide count of populations

		Map<String, Integer> courseMap = null;
		int count = 0;

		if (course.isEmpty()) {
			throw new NullPointerException("Course Name cannot be empty..");
		}

		courseMap = getcoursedata();

		if (!courseMap.containsKey(course)) {
			throw new NullPointerException("Course Name does not exist");
		} else {
			count = courseMap.get(course);
		}

		return count;
	}

}