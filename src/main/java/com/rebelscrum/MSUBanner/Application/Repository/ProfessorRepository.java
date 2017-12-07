package com.rebelscrum.MSUBanner.Application.Repository;

import com.rebelscrum.MSUBanner.Application.Entity.Professor;
import org.springframework.data.repository.CrudRepository;
/**
 * repository to communicate with the database.
 */
public interface ProfessorRepository extends
        CrudRepository<Professor, Integer> {


}

