package com.rebelscrum.MSUBanner.Application.Controllers;


import com.rebelscrum.MSUBanner.Application.Entity.Section;
import com.rebelscrum.MSUBanner.Application.Services.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SectionController {

    private SectionService sectionService;

    @Autowired
    public void setSectionService(SectionService sectionService) {this.sectionService = sectionService;}

    @RequestMapping(value = "/sections", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("sections", sectionService.listAllSections());
        return "sections";
    }

    @RequestMapping("section/{id}")
    public String showSection(@PathVariable Integer id, Model model){
        model.addAttribute("section", sectionService.getSectionById(id));
        return "sectionshow";
    }

    @RequestMapping("section/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("section", sectionService.getSectionById(id));
        return "sectionform";
    }

    @RequestMapping("section/new")
    public String newSection(Model model) {
        model.addAttribute("section", new Section());
        return "sectionform";
    }

    @RequestMapping(value = "section", method = RequestMethod.POST)
    public String saveSection(Section section) {
        sectionService.saveSection(section);
        return "redirect:/section/" + section.getId();
    }

    @RequestMapping("section/delete/{id}")
    public String delete(@PathVariable Integer id) {
        sectionService.deleteSection((id));
        return "redirect:/sections";
    }


}
