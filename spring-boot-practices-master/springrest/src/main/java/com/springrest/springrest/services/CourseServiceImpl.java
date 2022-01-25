package com.springrest.springrest.services;

import com.springrest.springrest.controller.entity.Course;
import com.springrest.springrest.dao.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CoursesService {

    @Autowired
    private CourseDao courseDao;
  //  List<Course> list;
    public CourseServiceImpl() {
     //   list=new ArrayList<>();
      // list.add(new Course(145,"Java Core","this course content java basic"));
       // list.add(new Course(146,"Java spring boot","this course content java spring boot basic"));
    }
    @Override
    public List<Course> getCourses() {
      return courseDao.findAll();
    }// log


    @Override
    public Course getCourse(long courseId) {
      /* Course c=null;
        for (Course course:
             list) {
            if(course.getId()==courseId)
            {
                c=course;
                break;
            }
        }
        c
        return c;*/

        return courseDao.getById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
      /*  list.add(course);
        return course;*/
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
      /*  list.forEach(e->{
            if(e.getId()== course.getId()){
                e.setTitle(course.getTitle());
                e.setDescription(course.getDescription());
            }
        });
        return course;*/
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
      //  list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
    Course entity=courseDao.getById(parseLong);
    courseDao.delete(entity);
    }
}
