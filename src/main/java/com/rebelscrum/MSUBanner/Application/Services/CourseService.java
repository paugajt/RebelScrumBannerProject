package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Course;

public interface CourseService {
    Iterable<Course> listAllCourses();

    Course getCourseById(Integer id);

    Course saveCourse(Course course);

    void deleteCourse(Integer id);
}
