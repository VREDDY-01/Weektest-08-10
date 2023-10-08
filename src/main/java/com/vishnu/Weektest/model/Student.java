package com.vishnu.Weektest.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
	@Id
	private String ID;
	private String name;
	private String age;
	private String phoneNumber;
	private String branch;
	private String department;

	@OneToOne
	private Address address;

	@ManyToMany
	@JoinTable(name = "student_Course_mapping", joinColumns = @JoinColumn(name = "fk_student_id"),inverseJoinColumns = @JoinColumn(name = "fk_course_id"))
	List<Courses> courses;
}
