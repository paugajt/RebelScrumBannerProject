package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Building;
import com.rebelscrum.MSUBanner.Application.Services.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *  Building controller to pass information between the database
 * and html pages.
 */
@Controller
public class BuildingController {

    /**
     *Services to be used by hibernate to correctly add
     * information to the database.
     */
    private BuildingService buildingService;

    /**
     * Setter for buildingServices mapping purposes.
     * @param buildingService
     */
    @Autowired
    public void setBuildingService(BuildingService buildingService) {
        this.buildingService = buildingService;
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param model
     * @return buildings
     */
    @RequestMapping(value = "/buildings", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("buildings", buildingService.listAllBuildings());
        return "buildings";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * mapped to show buildings
     * @param id
     * @param model
     * @return buildingshow
     */

    @RequestMapping("building/{id}")
    public String showBuilding(@PathVariable Integer id, Model model) {
        model.addAttribute("building", buildingService.getBuildingById(id));
        return "buildingshow";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * mapped to update building
     * @param id
     * @param model
     * @return buildingform
     */

    @RequestMapping("building/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("building", buildingService.getBuildingById(id));
        return "buildingform";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * mapped to create building
     * @param model
     * @return buildingform
     */

    @RequestMapping("building/new")
    public String newBuilding(Model model) {
        model.addAttribute("building", new Building());
        return "buildingform";
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @param Building
     * @return redirect:/building/
     */


    @RequestMapping(value = "building", method = RequestMethod.POST)
    public String saveBuilding(Building building) {
        buildingService.saveBuilding(building);
        return "redirect:/building/" + building.getId();
    }

    /**
     * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * Will be mapped to delete
     * @param id
     * @return redirect:/buildings
     */


    @RequestMapping("building/delete/{id}")
    public String delete(@PathVariable Integer id) {
        buildingService.deleteBuilding(id);
        return "redirect:/buildings";
    }

}
