package com.rebelscrum.MSUBanner.Application.Services;

import com.rebelscrum.MSUBanner.Application.Entity.Student;
import com.rebelscrum.MSUBanner.Application.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;

    @Autowired
    public void setUserRepository(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public Iterable<Student> listAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Integer id) { return studentRepository.findOne(id); }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.delete(id);
    }
}
