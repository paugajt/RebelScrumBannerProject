package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Student;


/**
 * interface to interact with semesters.
 */
public interface StudentService {
    /**
     * list all students.
     * @return
     */
    Iterable<Student> listAllStudents();

    /**
     * find student by id.
     * @param id
     * @return student
     */
    Student getStudentById(Integer id);

    /**
     * save student to database.
     * @param student
     * @return student
     */
    Student saveStudent(Student student);

    /**
     * delete student.
     * @param id
     */
    void deleteStudent(Integer id);
}
