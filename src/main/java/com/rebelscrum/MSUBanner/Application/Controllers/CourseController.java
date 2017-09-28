package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Course;
import com.rebelscrum.MSUBanner.Application.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CourseController {


    private CourseService courseService;

    @Autowired
    public void setCourseService(CourseService courseService){
        this.courseService = courseService;
    }

    @RequestMapping(value ="/courses", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("courses", courseService.listAllCourses());
        return "courses";
    }

    @RequestMapping("course/{id}")
    public String showCourse(@PathVariable Integer id, Model model){
        model.addAttribute("course", courseService.getCourseById(id));
        return "courseshow";
    }

    @RequestMapping("course/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("course", courseService.getCourseById(id));
        return "courseform";
    }

    @RequestMapping("course/new")
    public String newCourse(Model model){
        model.addAttribute("course", new Course());
        return "courseform";
    }



    @RequestMapping(value = "course", method = RequestMethod.POST)
    public String saveCourse(Course Course){
        courseService.saveCourse(Course);
        return "redirect:/course/" + Course.getId();
    }


    @RequestMapping("course/delete/{id}")
    public String delete(@PathVariable Integer id){
        courseService.deleteCourse(id);
        return "redirect:/courses";
    }


}
