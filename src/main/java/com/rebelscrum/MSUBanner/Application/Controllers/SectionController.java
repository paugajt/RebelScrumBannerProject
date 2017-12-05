package com.rebelscrum.MSUBanner.Application.Controllers;


import com.rebelscrum.MSUBanner.Application.Entity.Section;
import com.rebelscrum.MSUBanner.Application.Services.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Section Controller to pass info between database
 * and the html pages
 */
@Controller
public class SectionController {

    /**
     * Services to be used by hibernate to correctly add
     * information to the database
     */
    private SectionService sectionService;

    /**
     * Setter for the sectionService mapping
     * @param sectionService
     */
    @Autowired
    public void setSectionService(SectionService sectionService) {this.sectionService = sectionService;}

    /**
     * Pulls information from the webpages to update
     * a section in the database
     * @param model
     * @return
     */
    @RequestMapping(value = "/sections", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("sections", sectionService.listAllSections());
        return "sections";
    }

    /**
     * Pulls information from the webpages to update
     * a section in the database
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("section/{id}")
    public String showSection(@PathVariable Integer id, Model model){
        model.addAttribute("section", sectionService.getSectionById(id));
        return "sectionshow";
    }

    /**
     * Pulls information from the webpages to update
     * a section in the database
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("section/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("section", sectionService.getSectionById(id));
        return "sectionform";
    }

    /**
     * Pulls information from the webpages to create
     * a section in the database
     * @param model
     * @return
     */
    @RequestMapping("section/new")
    public String newSection(Model model) {
        model.addAttribute("section", new Section());
        return "sectionform";
    }

    /**
     * Pulls information from the webpages to update
     * a section in the database
     * @param section
     * @return
     */
    @RequestMapping(value = "section", method = RequestMethod.POST)
    public String saveSection(Section section) {
        sectionService.saveSection(section);
        return "redirect:/section/" + section.getId();
    }

    /**
     * Pulls information from the webpages to remove
     * a section in the database
     * @param id
     * @return
     */
    @RequestMapping("section/delete/{id}")
    public String delete(@PathVariable Integer id) {
        sectionService.deleteSection((id));
        return "redirect:/sections";
    }

}
