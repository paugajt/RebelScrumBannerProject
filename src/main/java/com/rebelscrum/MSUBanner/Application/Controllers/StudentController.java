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
 * Student controller to pass info between database
 * and html pages
 */
@Controller
public class StudentController {

    /**
     * Services to be used by hibernate to correctly add
     * information to the database
     */
    private StudentService studentService;

    /**
     * Setter for the studentService for mapping
     * @param studentService
     */
    @Autowired
    public void setStudentService(StudentService studentService){
        this.studentService = studentService;
    }

    /**
     * Pulls information from the webpages to update
     * a student in the database
     * @param model
     * @return
     */
    @RequestMapping(value ="/students", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("students", studentService.listAllStudents());
        return "students";
    }

    /**
     * Pulls information from the webpages to update
     * a student id in the database
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("student/{id}")
    public String showStudent(@PathVariable Integer id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "studentshow";
    }

    /**
     * Pulls information from the webpages to update
     * a student id in the database
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("student/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "studentform";
    }

    /**
     * Pulls information from the webpages to create
     * a student in the database
     * @param model
     * @return
     */
    @RequestMapping("student/new")
    public String newStudent(Model model){
        model.addAttribute("student", new Student());
        return "studentform";
    }

    /**
     * Pulls information from the webpages to update
     * a student in the database
     * @param student
     * @return
     */
    @RequestMapping(value = "student", method = RequestMethod.POST)
    public String saveStudent(Student student){
        studentService.saveStudent(student);
        return "redirect:/student/" + student.getId();
    }

    /**
     * Pulls information from the webpages to remove
     * a student in the database
     * @param id
     * @return
     */
    @RequestMapping("student/delete/{id}")
    public String delete(@PathVariable Integer id){
        studentService.deleteStudent(id);
        return "redirect:/students";
    }


}
