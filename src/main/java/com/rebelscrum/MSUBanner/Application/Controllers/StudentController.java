package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Student;
import com.rebelscrum.MSUBanner.Application.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controls the student class.
 */

@Controller
public class StudentController {


    /**
     *Services to be used by hibernate to correctly add
     * information to the database.
     */
    private StudentService studentService;

    /**
     * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param studentService
     */
    @Autowired
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    /**
     * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param model
     * @return students
     */
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("students", studentService.listAllStudents());
        return "students";
    }

    /**
     * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param id
     * @param model
     * @return student show
     */
    @RequestMapping("student/{id}")
    public String showStudent(@PathVariable Integer id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "studentshow";
    }

    /**
     * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param id
     * @param model
     * @return student form
     */
    @RequestMapping("student/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "studentform";
    }

    /**
     * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param model
     * @return student form
     */
    @RequestMapping("student/new")
    public String newStudent(Model model) {
        model.addAttribute("student", new Student());
        return "studentform";
    }


    /**
     * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param student
     * @return redirect
     */
    @RequestMapping(value = "student", method = RequestMethod.POST)
    public String saveStudent(Student student) {
        studentService.saveStudent(student);
        return "redirect:/student/" + student.getId();
    }


    /**
     * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param id
     * @return
     */
    @RequestMapping("student/delete/{id}")
    public String delete(@PathVariable Integer id) {
        studentService.deleteStudent(id);
        return "redirect:/students";
    }


}
