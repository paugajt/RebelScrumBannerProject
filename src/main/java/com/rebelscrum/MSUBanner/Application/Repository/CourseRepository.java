package com.rebelscrum.MSUBanner.Application.Repository;

import com.rebelscrum.MSUBanner.Application.Entity.Course;
import org.springframework.data.repository.CrudRepository;
/**
 * repository to communicate with the database.
 */
public interface CourseRepository extends CrudRepository<Course, Integer> {
}
