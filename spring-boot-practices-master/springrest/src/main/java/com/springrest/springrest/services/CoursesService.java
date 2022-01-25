package com.springrest.springrest.services;

import com.springrest.springrest.controller.entity.Course;
import com.springrest.springrest.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface CoursesService  {

     List<Course> getCourses();

    Course getCourse(long courseId );// optional return

    Course addCourse(Course course);

    Course updateCourse(Course course);

     void deleteCourse(long parseLong);
     // couseDao.


}
// exception pkg and their classes