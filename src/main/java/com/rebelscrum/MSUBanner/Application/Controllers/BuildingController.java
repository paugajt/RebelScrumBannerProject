package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Building;
import com.rebelscrum.MSUBanner.Application.Services.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BuildingController {


    private BuildingService buildingService;

    @Autowired
    public void setBuildingService(BuildingService buildingService){
        this.buildingService = buildingService;
    }

    @RequestMapping(value ="/building", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("building", buildingService.listAllBuildings());
        return "building";
    }

    @RequestMapping("building/{id}")
    public String showBuilding(@PathVariable Integer id, Model model){
        model.addAttribute("building", buildingService.getBuildingById(id));
        return "buildingshow";
    }

    @RequestMapping("building/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("building", buildingService.getBuildingById(id));
        return "buildingform";
    }

    @RequestMapping("building/new")
    public String newBuilding(Model model){
        model.addAttribute("building", new Building());
        return "buildingform";
    }


    @RequestMapping(value = "building", method = RequestMethod.POST)
    public String saveBuilding(Building Building){
        buildingService.saveBuilding(Building);
        return "redirect:/building/" + Building.getId();
    }


    @RequestMapping("building/delete/{id}")
    public String delete(@PathVariable Integer id){
        buildingService.deleteBuilding(id);
        return "redirect:/building";
    }

}
