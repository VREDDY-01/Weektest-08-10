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
public class Courses {
	@Id
	private String ID;
	private String title;
	private String description;
	private String duration;

	@ManyToMany(mappedBy = "courses")
	List<Student> studentsList;
}
