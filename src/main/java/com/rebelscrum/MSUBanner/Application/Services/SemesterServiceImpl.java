package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Semester;
import com.rebelscrum.MSUBanner.Application.Repository.SemesterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * implementation to communicate with the database.
 */
@Service
public class SemesterServiceImpl implements SemesterService {

    /**
     * repository to communicate with database.
     */
    private SemesterRepository semesterRepository;

    /**
     * setter used for testing purposes.
     * @param semesterRepository
     */
    @Autowired
    public void setSemesterRepository(SemesterRepository semesterRepository) {
        this.semesterRepository = semesterRepository;
    }

    /**
     * list all semesters.
     * @return list of semesters
     */
    @Override
    public Iterable<Semester> listAllSemesters() {
        return semesterRepository.findAll();
    }

    /**
     * find semester.
     * @param id of semester
     * @return semester
     */
    @Override
    public Semester getSemesterById(Integer id) {
        return semesterRepository.findOne(id);
    }

    /**
     * save semester.
     * @param semester
     * @return semester
     */
    @Override
    public Semester saveSemester(Semester semester) {
        return semesterRepository.save(semester); }

    /**
     * delete semester.
     * @param id
     */
    @Override
    public void deleteSemester(Integer id) {
        semesterRepository.delete(id); }
}
