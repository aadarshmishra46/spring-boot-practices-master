package com.springrest.springrest.dao;

import com.springrest.springrest.controller.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {
}
