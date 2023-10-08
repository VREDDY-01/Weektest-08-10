package com.vishnu.Weektest.controller;

import com.vishnu.Weektest.model.Student;
import com.vishnu.Weektest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@PostMapping("student")
	public String addStudent(@RequestBody Student student){
		return studentService.addStudent(student);
	}
	@GetMapping("student")
	public List<Student> getStudents(){
		return studentService.getstudents();
	}
	@PutMapping("student/{id}")
	public String updateStudent(@PathVariable String id,@RequestBody Student student){
		return studentService.updateStudent(id,student);
	}
	@DeleteMapping("student/{id}")
	public String delStudent(@PathVariable String id){
		return studentService.delStudent(id);
	}
}
