package com.vishnu.Weektest.service;

import com.vishnu.Weektest.model.Student;
import com.vishnu.Weektest.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
	@Autowired
	StudentRepo studentRepo;

	public String addStudent(Student student) {
		studentRepo.save(student);
		return "saved";
	}

	public List<Student> getstudents() {
		return studentRepo.findAll();
	}

	public String updateStudent(String id, Student student) {
		Student found = studentRepo.findById(id).orElse(null);
		if (found!=null){
			found.setAddress(student.getAddress());
			found.setAge(student.getAge());
			found.setBranch(student.getBranch());
			found.setName(student.getName());
			found.setCourses(student.getCourses());
			found.setPhoneNumber(student.getPhoneNumber());
			studentRepo.save(found);
			return "updated";
		}
		return "Invalid id";
	}

	public String delStudent(String id) {
		studentRepo.deleteById(id);
		return "deleted";
	}
}
