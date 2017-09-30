package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Professor;
import com.rebelscrum.MSUBanner.Application.Services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class ProfessorController {

    private ProfessorService professorService;

    @Autowired
    public void setProfessorService(ProfessorService professorService){
        this.professorService = professorService;
    }

    @RequestMapping(value ="/professors", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("professors", professorService.listAllProfessors());
        return "professors";
    }

    @RequestMapping("professor/{id}")
    public String showProfessor(@PathVariable Integer id, Model model){
        model.addAttribute("professor", professorService.getProfessorById(id));
        return "professorshow";
    }

    @RequestMapping("professor/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("professor", professorService.getProfessorById(id));
        return "professorform";
    }

    @RequestMapping("professor/new")
    public String newProfessor(Model model){
        model.addAttribute("professor", new Professor());
        return "professorform";
    }



    @RequestMapping(value = "professor", method = RequestMethod.POST)
    public String saveProfessor(Professor professor){
        professorService.saveProfessor(professor);
        return "redirect:/professor/" + professor.getId();
    }


    @RequestMapping("professor/delete/{id}")
    public String delete(@PathVariable Integer id){
        professorService.deleteProfessor(id);
        return "redirect:/professor";
    }


}
