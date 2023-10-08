package com.vishnu.Weektest.controller;

import com.vishnu.Weektest.model.Book;
import com.vishnu.Weektest.model.Courses;
import com.vishnu.Weektest.service.CoursesService;
import com.vishnu.Weektest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
	@Autowired
	CoursesService coursesService;

	@PostMapping("course")
	public String addCourse(@RequestBody Courses course){
		return coursesService.addCourse(course);
	}
	@GetMapping("course")
	public List<Courses> getCourse(){
		return coursesService.getCourse();
	}
	@PutMapping("course/{id}")
	public String updateCourse(@PathVariable String id,@RequestBody Courses course){
		return coursesService.updateCourse(id,course);
	}
	@DeleteMapping("course/{id}")
	public String delCourse(@PathVariable String id){
		return coursesService.delCourse(id);
	}
}
