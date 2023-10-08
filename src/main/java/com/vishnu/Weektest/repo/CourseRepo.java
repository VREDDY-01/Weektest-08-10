package com.vishnu.Weektest.repo;

import com.vishnu.Weektest.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Courses,String> {
}
