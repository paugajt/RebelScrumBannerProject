package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Course;

/**
 * interface to communicate with the database.
 */
public interface CourseService {

    /**
     * Lists all the courses in the database.
     * @return the list of the courses
     */
    Iterable<Course> listAllCourses();

    /**
     * find the course in the database.
     * @param id of the course
     * @return course name
     */
    Course getCourseById(Integer id);

    /**
     * save the course to the database.
     * @param course
     * @return save the course
     */
    Course saveCourse(Course course);

    /**
     * delete the course from the database.
     * @param id to delete
     */
    void deleteCourse(Integer id);
}
