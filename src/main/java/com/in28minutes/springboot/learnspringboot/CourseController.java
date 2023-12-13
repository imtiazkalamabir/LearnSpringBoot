package com.in28minutes.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// http://localhost:8080/courses
// Course: id, name, author
@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28minutes"),
                new Course(2, "Learn AWS", "in28minutes"),
                new Course(3, "Learn DataScience", "in28minutes"),
                new Course(4, "Learn Python", "in28minutes"),
                new Course(5, "Learn Java", "in28minutes"),
                new Course(6, "Learn Kotlin", "in28minutes"),
                new Course(7, "Learn Flutter", "in28minutes"),
                new Course(8, "Learn Flutter", "in28minutes"),
                new Course(9, "Learn NodeJS", "in28minutes"),
                new Course(10, "Learn React Native", "in28minutes")
        );
    }
}
