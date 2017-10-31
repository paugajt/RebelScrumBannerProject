package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Semester;
import com.rebelscrum.MSUBanner.Application.Entity.Student;
import com.rebelscrum.MSUBanner.Application.Entity.User;

public interface SemesterService {

    Semester getSemesterById (Integer year);

    Iterable<Semester> listAllSemesters();

}
