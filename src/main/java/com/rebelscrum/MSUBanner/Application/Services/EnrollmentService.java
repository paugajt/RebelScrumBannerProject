package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Enrollment;

/**
 * services.
 */

public interface EnrollmentService {
    /**
     * @return enrollments
     */
    Iterable<Enrollment> listAllEnrollments();

    /**
     * @param id
     * @return enrollment
     */
    Enrollment getEnrollmentById(Integer id);

    /**
     * @param enrollment
     * @return enrollment
     */
    Enrollment saveEnrollment(Enrollment enrollment);

    /**
     * @param id
     */
    void deleteEnrollment(Integer id);
}
