package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Course;
import com.rebelscrum.MSUBanner.Application.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation to communicate with the database.
 */
@Service
public class CourseServiceImpl implements CourseService {
    /**
     * repository to communicate with the database.
     */
    private CourseRepository courseRepository;

    /**
     * setter used for testing purposes.
     * @param courseRepository
     */
    @Autowired
    public void setCourseRepository(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    /**
     * list all the courses in the database.
     * @return the list of all courses
     */
    @Override
    public Iterable<Course> listAllCourses() {
        return courseRepository.findAll();
    }

    /**
     * find the course in the database.
     * @param id of the course
     * @return the course
     */
    @Override
    public Course getCourseById(Integer id) {
        return courseRepository.findOne(id);
    }

    /**
     * save the course to the database.
     * @param course
     * @return the course
     */
    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    /**
     * delete the course.
     * @param id to delete
     */
    @Override
    public void deleteCourse(Integer id) {
        courseRepository.delete(id);
    }
}
