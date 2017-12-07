package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Semester;
import com.rebelscrum.MSUBanner.Application.Services.SemesterService;
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
public class SemesterController {

    /**
     *Services to be used by hibernate to correctly add.
     * information to the database.
     */
    private SemesterService semesterService;

    /**
     * Setter for courseService for mapping.
     * @param semesterService
     */
    @Autowired
    public void setSemesterService(SemesterService semesterService) {
        this.semesterService = semesterService;
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param model
     * @return semesters
     */
    @RequestMapping(value = "/semesters", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("semesters", semesterService.listAllSemesters());
        return "semesters";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param id
     * @param model
     * @return semester show
     */

    @RequestMapping("semester/{id}")
    public String showCourse(@PathVariable Integer id, Model model) {
        model.addAttribute("semester", semesterService.getSemesterById(id));
        return "semestershow";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param id
     * @param model
     * @return semester form
     */

    @RequestMapping("semester/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("semester", semesterService.getSemesterById(id));
        return "semesterform";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param model
     * @return semester form
     */

    @RequestMapping("semester/new")
    public String newCourse(Model model) {
        model.addAttribute("semester", new Semester());
        return "semesterform";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param Semester
     * @return semester redirect
     */

    @RequestMapping(value = "semester", method = RequestMethod.POST)
    public String saveSemester(Semester Semester) {
        semesterService.saveSemester(Semester);
        return "redirect:/semester/" + Semester.getSemesterYear();
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param id
     * @return redirect
     */

    @RequestMapping("semester/delete/{id}")
    public String delete(@PathVariable Integer id) {
        semesterService.deleteSemester(id);
        return "redirect:/semesters";
    }

}
