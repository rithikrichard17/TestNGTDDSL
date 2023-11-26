package com.SimpliLearn.TDD;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCourseSearch {
	@Test
	public void findcourse() {

		String course = "Ruby";

		int ExpectedPractise = 25;

		CourseSearch ps = new CourseSearch();

		// number of people in the city

		int count = ps.getCourse(course);

		System.out.println(count);

		Assert.assertEquals(count, ExpectedPractise);

	}

	@Test
	public void findcourseEmptyInput() {

		try {
			String course = "";
			int ExpectedPopulation = 0;
			CourseSearch ps = new CourseSearch();

			int count = ps.getCourse(course);

		} catch (NullPointerException e) {

			System.out.println("course name cannot be empty");
		}

	}

	@Test
	public void findcourseInvalidInput() {

		try {
			String course = "Jupiter";
			int ExpectedPopulation = 700;
			CourseSearch ps = new CourseSearch();

			int count = ps.getCourse(course);

		} catch (NullPointerException e) {

			System.out.println("Course name does not exist in the list");
		}

	}

}