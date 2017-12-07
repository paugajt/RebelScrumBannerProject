package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Enrollment;
import com.rebelscrum.MSUBanner.Application.Repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * service implementation.
 */

@Service
public class EnrollmentServiceImpl implements EnrollmentService {
    /**
     * enrollment repository.
     */
    private EnrollmentRepository enrollmentRepository;

    /**
     * @param enrollmentRepository
     */
    @Autowired
    public void setEnrollmentRepository(EnrollmentRepository
                                                    enrollmentRepository) {
        this.enrollmentRepository = enrollmentRepository; }

    /**
     * @return enrollments
     */
    @Override
    public Iterable<Enrollment> listAllEnrollments() {
        return enrollmentRepository.findAll(); }

    /**
     * @param id
     * @return enrollment
     */
    @Override
    public Enrollment getEnrollmentById(Integer id) {
        return enrollmentRepository.findOne(id); }

    /**
     * @param enrollment
     * @return enrollment repository
     */
    @Override
    public Enrollment saveEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment); }

    /**
     * @param id
     */
    @Override
    public void deleteEnrollment(Integer id) {
        enrollmentRepository.delete(id); }

}
