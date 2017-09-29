package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Student;


public interface StudentService {
    Iterable<Student> listAllStudents();

    Student getStudentById(Integer id);

    Student saveStudent(Student student);

    void deleteStudent(Integer id);
}
