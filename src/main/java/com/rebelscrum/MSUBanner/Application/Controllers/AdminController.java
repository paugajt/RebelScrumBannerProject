package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Admin;
import com.rebelscrum.MSUBanner.Application.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.HashMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class AdminController {

    private AdminService adminService;

    @Autowired
    public void setAdminService(AdminService adminService){
        this.adminService = adminService;
    }

    @RequestMapping(value ="/admins", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("admins", adminService.listAllAdmins());
        return "admins";
    }

    @RequestMapping("admin/{id}")
    public String showAdmin (@PathVariable Integer id, Model model){
        model.addAttribute("admin", adminService.getAdminById(id));
        return "adminshow";
    }

    @RequestMapping("admin/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("admin", adminService.getAdminById(id));
        return "adminform";
    }

    @RequestMapping("admin/new")
    public String newAdmin (Model model){
        model.addAttribute("admin", new Admin());
        return "adminform";
    }

    @RequestMapping("admin/login")
    public String loginUser(){
        return "login";
    }

    @RequestMapping(value = "admin", method = RequestMethod.POST)
    public String saveAdmin(Admin admin){
        adminService.saveAdmin(admin);
        return "redirect:/admin/" + admin.getId();
    }


    @RequestMapping("admin/delete/{id}")
    public String deleteAdmin (@PathVariable Integer id){
        adminService.deleteAdmin (id);
        return "redirect:/admins";
    }

    /*@ModelAttribute("departmentList")
    public Map <String, String> getDepartmentList()
    {
        Map<String, String> departmentList = new HashMap<String, String>();
        departmentList.put("Science", "Science");
        departmentList.put("Tech", "Technology");
        departmentList.put("Engineer", "Engineer");
        departmentList.put("Math", "Mathematics");
        return departmentList;
    }
    */
}
