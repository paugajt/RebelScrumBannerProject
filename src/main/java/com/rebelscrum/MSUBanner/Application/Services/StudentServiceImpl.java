package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Student;
import com.rebelscrum.MSUBanner.Application.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * implementation to communicate with the database.
 */
@Service
public class StudentServiceImpl implements StudentService {

    /**
     * repository to communicate with the database.
     */
    private StudentRepository studentRepository;

    /**
     * setter used for testing purposes.
     * @param studentRepository
     */
    @Autowired
    public void setUserRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /**
     * list all students.
     * @return list of students
     */
    @Override
    public Iterable<Student> listAllStudents() {
        return studentRepository.findAll();
    }

    /**
     * find student by id.
     * @param id
     * @return student
     */
    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findOne(id); }

    /**
     * save student to database.
     * @param student
     * @return student
     */
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    /**
     * delete student from database.
     * @param id
     */
    @Override
    public void deleteStudent(Integer id) {
        studentRepository.delete(id);
    }
}
