package com.rebelscrum.MSUBanner.Application.Repository;

import com.rebelscrum.MSUBanner.Application.Entity.Student;
import org.springframework.data.repository.CrudRepository;
/**
 * repository to communicate with the database.
 */
public interface StudentRepository extends CrudRepository<Student, Integer> {


}

