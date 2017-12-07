package com.rebelscrum.MSUBanner.Application.Repository;

import com.rebelscrum.MSUBanner.Application.Entity.Enrollment;
import org.springframework.data.repository.CrudRepository;

/**
 * crud repo.
 */
public interface EnrollmentRepository extends
        CrudRepository<Enrollment, Integer> {
}
