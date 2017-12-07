package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.Admin;
import com.rebelscrum.MSUBanner.Application.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;


/**
 * Admin controller to pass info between database and
 * html pages.
 */
@Controller
public class AdminController {

    /**
     * Services to be used by hibernate to correctly add
     * information to the database.
     */
    private AdminService adminService;

    /**
     * setter for adminService for mapping.
     * @param adminService
     */
    @Autowired
    public void setAdminService(final AdminService adminService) {
        this.adminService = adminService;
    }

    /**
     *Will pull information from the webpages to update a
     * building to be store into the database.
     * @param model
     * @return admins
     */
    @RequestMapping(value = "/admins", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("admins", adminService.listAllAdmins());
        return "admins";
    }

    /**
     * Will pull information from the webpages to update a
     * building to be store into the database.
     * @param id
     * @param model
     * @return adminshow
     */

    @RequestMapping("admin/{id}")
    public String showAdmin(@PathVariable Integer id, Model model) {
        model.addAttribute("admin", adminService.getAdminById(id));
        return "adminshow";
    }

    /**
     *  Will pull information from the webpages to update a
     * building to be store into the database
     * @param id
     * @param model
     * @return adminform
     */

    @RequestMapping("admin/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("admin", adminService.getAdminById(id));
        return "adminform";
    }

    /**
     *  Will pull information from the webpages to update a
     * building to be store into the database.
     * @param model
     * @return adminform
     */

    @RequestMapping("admin/new")
    public String newAdmin(Model model) {
        model.addAttribute("admin", new Admin());
        return "adminform";
    }

    /**
     *  Will pull information from the webpages to update a
     * building to be store into the database.
     * @return login
     */

    @RequestMapping("admin/login")
    public String loginUser() {
        return "login";
    }

    /**
     *  Will pull information from the webpages to update a
     * building to be store into the database.
     * @param admin
     * @return redirect:/admin/
     */

    @RequestMapping(value = "admin", method = RequestMethod.POST)
    public String saveAdmin(Admin admin) {
        adminService.saveAdmin(admin);
        return "redirect:/admin/" + admin.getId();
    }

    /**
     *  Will pull information from the webpages to update a
     * building to be store into the database.
     * @param id
     * @return redirect:/admins
     */

    @RequestMapping("admin/delete/{id}")
    public String deleteAdmin(@PathVariable Integer id) {
        adminService.deleteAdmin(id);
        return "redirect:/admins";
    }

    @ModelAttribute("departmentList")
    public Map<String, String> getDepartmentList()
    {
        Map<String, String> departmentList = new HashMap<String, String>();
        departmentList.put("Science", "Science");
        departmentList.put("Tech", "Technology");
        departmentList.put("Engineer", "Engineer");
        departmentList.put("Math", "Mathematics");
        return departmentList;
    }


}
