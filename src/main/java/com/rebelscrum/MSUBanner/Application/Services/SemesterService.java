package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Semester;

/**
 * interface to communicate with the database.
 */
public interface SemesterService {


    /**
     * find the semester.
     * @param id
     * @return semester
     */
    Semester getSemesterById (Integer id);

    /**
     * list all of the semesters.
     * @return semesters
     */
    Iterable<Semester> listAllSemesters();

    /**
     * save semesters.
     * @param semester
     * @return semester
     */
    Semester saveSemester(Semester semester);

    /**
     * delete semesters.
     * @param id
     */
    void deleteSemester(Integer id);

}
