package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Professor;


/**
 * interface to communicate with the database.
 */
public interface ProfessorService {
    /**
     * list all professors from the database.
     * @return the list of the professors
     */
    Iterable<Professor> listAllProfessors();

    /**
     * find professor in the database.
     * @param id of professor
     * @return professor
     */
    Professor getProfessorById(Integer id);

    /**
     * save the professor to the database.
     * @param professor
     * @return professor
     */
    Professor saveProfessor(Professor professor);

    /**
     * delete the professor from the database.
     * @param id
     */
    void deleteProfessor(Integer id);
}
