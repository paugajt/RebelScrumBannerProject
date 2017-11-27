package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Semester;
import com.rebelscrum.MSUBanner.Application.Repository.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SemesterServiceImpl implements SemesterService{
    private SemesterRepository semesterRepository;

    @Autowired
    public void setSemesterRepository(SemesterRepository semesterRepository){
        this.semesterRepository = semesterRepository;
    }

    @Override
    public Iterable<Semester> listAllSemesters() {
        return semesterRepository.findAll();
    }

    @Override
    public Semester getSemesterById(Integer year) {
        return semesterRepository.findOne(year);
    }

}
