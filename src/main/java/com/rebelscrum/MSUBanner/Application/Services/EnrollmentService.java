package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Enrollment;

public interface EnrollmentService {
    Iterable<Enrollment> listAllEnrollments();

    Enrollment getEnrollmentById(Integer id);

    Enrollment saveEnrollment(Enrollment enrollment);

    void deleteEnrollment(Integer id);
}
