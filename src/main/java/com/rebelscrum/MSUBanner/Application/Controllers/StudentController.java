package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Student;
import com.rebelscrum.MSUBanner.Application.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping(value ="/students", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("students", studentService.listAllStudents());
        return "students";
    }

    @RequestMapping("student/{id}")
    public String showStudent(@PathVariable Integer id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "studentshow";
    }

    @RequestMapping("student/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "studentform";
    }

    @RequestMapping("student/new")
    public String newStudent(Model model){
        model.addAttribute("student", new Student());
        return "studentform";
    }



    @RequestMapping(value = "student", method = RequestMethod.POST)
    public String saveStudent(Student student){
        studentService.saveStudent(student);
        return "redirect:/student/" + student.getId();
    }


    @RequestMapping("student/delete/{id}")
    public String delete(@PathVariable Integer id){
        studentService.deleteStudent(id);
        return "redirect:/student";
    }


}
