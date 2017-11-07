package com.rebelscrum.MSUBanner.Application.Repository;

import org.springframework.data.repository.CrudRepository;
import com.rebelscrum.MSUBanner.Application.Entity.Semester;

public interface SemesterRepository extends CrudRepository <Semester, Integer> {
}
