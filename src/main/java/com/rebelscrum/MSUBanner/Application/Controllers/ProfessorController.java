package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Professor;
import com.rebelscrum.MSUBanner.Application.Services.ProfessorService;
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
public class ProfessorController {
    /**
     *implementation used to communicate with the database.
     */

    private ProfessorService professorService;

    /**
     * Setter for mapping purposes.
     * @param professorService
     */
    @Autowired
    public void setProfessorService(ProfessorService professorService) {
        this.professorService = professorService;
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param model
     * @return professors
     */
    @RequestMapping(value = "/professors", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("professors",
                professorService.listAllProfessors());
        return "professors";
    }

    /**
     * Mapping to the id of the professor.
     * @param id
     * @param model
     * @return professorshow
     */

    @RequestMapping("professor/{id}")
    public String showProfessor(@PathVariable Integer id, Model model) {
        model.addAttribute("professor",
                professorService.getProfessorById(id));
        return "professorshow";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param id
     * @param model
     * @return professor form
     */
    @RequestMapping("professor/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("professor",
                professorService.getProfessorById(id));
        return "professorform";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param model
     * @return professor form
     */
    @RequestMapping("professor/new")
    public String newProfessor(Model model) {
        model.addAttribute("professor", new Professor());
        return "professorform";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param professor
     * @return redirect
     */
    @RequestMapping(value = "professor", method = RequestMethod.POST)
    public String saveProfessor(Professor professor) {
        professorService.saveProfessor(professor);
        return "redirect:/professor/" + professor.getId();
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param id
     * @return redirect
     */
    @RequestMapping("professor/delete/{id}")
    public String delete(@PathVariable Integer id) {
        professorService.deleteProfessor(id);
        return "redirect:/professors";
    }


}
