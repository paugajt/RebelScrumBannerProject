package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Enrollment;
import com.rebelscrum.MSUBanner.Application.Repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {
    private EnrollmentRepository enrollmentRepository;

    @Autowired
    public void setEnrollmentRepository(EnrollmentRepository enrollmentRepository) {this.enrollmentRepository = enrollmentRepository;};

    @Override
    public Iterable<Enrollment> listAllEnrollments() {return enrollmentRepository.findAll();}

    @Override
    public Enrollment getEnrollmentById(Integer id) {return enrollmentRepository.findOne(id);}

    @Override
    public Enrollment saveEnrollment(Enrollment enrollment) {return enrollmentRepository.save(enrollment);}

    @Override
    public void deleteEnrollment(Integer id) {enrollmentRepository.delete(id);}

}
