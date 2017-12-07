package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Course;
import com.rebelscrum.MSUBanner.Application.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 */

@Controller
public class CourseController {

    /**
     *
     */
    private CourseService courseService;

    /**
     * Setter for courseService for mapping.
     * @param courseService
     */
    @Autowired
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param model
     * @return courses
     */
    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("courses", courseService.listAllCourses());
        return "courses";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param id
     * @param model
     * @return courseshow
     */

    @RequestMapping("course/{id}")
    public String showCourse(@PathVariable Integer id, Model model) {
        model.addAttribute("course", courseService.getCourseById(id));
        return "courseshow";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param id
     * @param model
     * @return courseform
     */

    @RequestMapping("course/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("course", courseService.getCourseById(id));
        return "courseform";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param model
     * @return courseform
     */

    @RequestMapping("course/new")
    public String newCourse(Model model) {
        model.addAttribute("course", new Course());
        return "courseform";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param Course
     * @return redirect
     */

    @RequestMapping(value = "course", method = RequestMethod.POST)
    public String saveCourse(Course Course) {
        courseService.saveCourse(Course);
        return "redirect:/course/" + Course.getId();
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param id
     * @return redirect
     */

    @RequestMapping("course/delete/{id}")
    public String delete(@PathVariable Integer id) {
        courseService.deleteCourse(id);
        return "redirect:/courses";
    }


}
