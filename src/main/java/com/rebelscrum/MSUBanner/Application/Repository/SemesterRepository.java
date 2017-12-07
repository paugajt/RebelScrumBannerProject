package com.rebelscrum.MSUBanner.Application.Repository;

import org.springframework.data.repository.CrudRepository;
import com.rebelscrum.MSUBanner.Application.Entity.Semester;
/**
 * repository to communicate with the database.
 */
public interface SemesterRepository extends CrudRepository<Semester, Integer> {
}
