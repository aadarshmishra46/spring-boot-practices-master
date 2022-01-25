package com.springrest.springrest.controller;

import com.springrest.springrest.controller.entity.Course;
import com.springrest.springrest.services.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//sl4j
@CrossOrigin
@RestController
public class MyController {
    @Autowired
    private CoursesService coursesService;

   // log.info
    //get the course
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.coursesService.getCourses();

    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.coursesService.getCourse(Long.parseLong(courseId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.coursesService.addCourse(course);
    }

    //put
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.coursesService.updateCourse(course);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try{
             this.coursesService.deleteCourse(Long.parseLong(courseId));
             return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
