package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Enrollment;
import com.rebelscrum.MSUBanner.Application.Services.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sun.misc.Request;

@Controller
public class EnrollmentController {
    /**
     *
     */
    private EnrollmentService enrollmentService;

    /**
     * Setter for enrollmentService for mapping
     * @param enrollmentService
     */
    @Autowired
    public void setEnrollmentService(EnrollmentService enrollmentService) {this.enrollmentService = enrollmentService;}

    /**
     * Lists all of the enrollments in the database
     * @param model
     * @return
     */
    @RequestMapping(value = "/enrollments", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("enrollments", enrollmentService.listAllEnrollments());
        return "enrollments";
    }

    /**
     * Shows an Enrollment based on the id passed in
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("enrollment/{id}")
    public String showEnrollment(@PathVariable Integer id, Model model) {
        model.addAttribute("enrollment", enrollmentService.getEnrollmentById(id));
        return "enrollmentshow";
    }

    /**
     * Pulls up the webpage form to edit the enrollment specified by the id parameter
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("enrollment/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("enrollment", enrollmentService.getEnrollmentById(id));
        return "enrollmentform";
    }

    /**
     * Routes to the webpage form to create a new Enrollment
     * @param model
     * @return
     */
    @RequestMapping("enrollment/new")
    public String newEnrollment(Model model) {
        model.addAttribute("enrollment", new Enrollment());
        return "enrollmentform";
    }

    /**
     * Saves the created enrollment and redirects to the webpage to
     * show the enrollment details
     * @param enrollment
     * @return
     */
    @RequestMapping(value = "enrollment", method = RequestMethod.POST)
    public String saveEnrollment(Enrollment enrollment) {
        enrollmentService.saveEnrollment(enrollment);
        return "redirect:/enrollment/" + enrollment.getId();
    }

    /**
     * deletes the given enrollment and redirects to the enrollment list page
     * @param id
     * @return
     */
    @RequestMapping("enrollment/delete/{id}")
    public String delete(@PathVariable Integer id) {
        enrollmentService.deleteEnrollment(id);
        return "redirect:/enrollments";
    }
}
