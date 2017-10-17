package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Professor;


public interface ProfessorService {
    Iterable<Professor> listAllProfessors();

    Professor getProfessorById(Integer id);

    Professor saveProfessor(Professor professor);

    void deleteProfessor(Integer id);
}
