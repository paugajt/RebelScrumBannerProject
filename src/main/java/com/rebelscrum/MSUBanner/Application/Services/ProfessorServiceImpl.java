package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Professor;
import com.rebelscrum.MSUBanner.Application.Repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation to communicate with the database.
 */
@Service
public class ProfessorServiceImpl implements ProfessorService {
    /**
     * repository to communicate with the database.
     */
    private ProfessorRepository professorRepository;

    /**
     * setter used for testing purposes.
     * @param professorRepository
     */
    @Autowired
    public void setProfessorRepository(
            ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    /**
     * list all the professors from the database.
     * @return list of professors
     */
    @Override
    public Iterable<Professor> listAllProfessors() {
        return professorRepository.findAll();
    }

    /**
     * find the professor in the database.
     * @param id of professor
     * @return the professor
     */
    @Override
    public Professor getProfessorById(Integer id) {
        return professorRepository.findOne(id);
    }

    /**
     * save the professor to the database.
     * @param professor
     * @return the professor
     */
    @Override
    public Professor saveProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    /**
     * delete the professor in the database.
     * @param id of professor
     */
    @Override
    public void deleteProfessor(Integer id) {
        professorRepository.delete(id);
    }
}
