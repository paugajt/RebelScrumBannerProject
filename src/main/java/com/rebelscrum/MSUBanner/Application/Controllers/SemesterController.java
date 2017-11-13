package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Semester;
import com.rebelscrum.MSUBanner.Application.Services.SectionService;
import com.rebelscrum.MSUBanner.Application.Services.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SemesterController {

    private SemesterService semesterService;

    @Autowired
    public void setSemesterService(SemesterService semesterService){
        this.semesterService = semesterService;
    }


    private SectionService sectionService;
    @Autowired
    public void setSectionService(SectionService sectionService) {
        this.sectionService = sectionService;
    }

    // Display Semesters
    @RequestMapping(value ="/semesters", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("semesters", semesterService.listAllSemesters());
        return "semesters";
    }

    @RequestMapping("semester/{id}")
    public String showSemester(@PathVariable Integer id, Model model){
        model.addAttribute("semester", semesterService.getSemesterById(id));
        return "semestershow";
    }
}
