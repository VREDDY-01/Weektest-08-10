package com.vishnu.Weektest.service;

import com.vishnu.Weektest.model.Courses;
import com.vishnu.Weektest.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {
	@Autowired
	CourseRepo courseRepo;

	public String addCourse(Courses course) {
		courseRepo.save(course);
		return "saved";
	}

	public List<Courses> getCourse() {
		return courseRepo.findAll();
	}

	public String updateCourse(String id, Courses course) {
		course.setID(id);
		courseRepo.save(course);
		return "updated";
	}

	public String delCourse(String id) {
		courseRepo.deleteById(id);
		return "deleted";
	}
}
