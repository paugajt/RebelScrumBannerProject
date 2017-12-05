package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.User;
import com.rebelscrum.MSUBanner.Application.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * User controller to pass information between the database
 * and html pages
 */
@Controller
public class UserController {

    /**
     * Services to be used by hibernate to correctly add
     * information to the database
     */
    private UserService userService;

    /**
     * Setter for the buildingServices mapping purposes
     * @param userService
     */
    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    /**
     * Pulls information from the webpages to update
     * a user in the database
     * @param model
     * @return
     */
    @RequestMapping(value ="/users", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("users", userService.listAllUsers());
        return "users";
    }

    /**
     * Pulls information from the webpages to update
     * a user in the database
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("user/{id}")
    public String showUser(@PathVariable Integer id, Model model){
        model.addAttribute("user", userService.getUserById(id));
        return "usershow";
    }

    /**
     * Pulls information from the webpages to update
     * a user in the database
     * @param id
     * @param model
     * @return
     */
    @RequestMapping("user/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("user", userService.getUserById(id));
        return "userform";
    }

    /**
     * Pulls information from the webpages to create
     * a user in the database
     * @param model
     * @return
     */
    @RequestMapping("user/new")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "userform";
    }

    /**
     * Pulls information from the webpages to update
     * a user in the database
     * @return
     */
    @RequestMapping("user/login")
    public String loginUser(){
        return "login";
    }

    /**
     * Pulls information from the webpages to update
     * a user in the database
     * @param user
     * @return
     */
  @RequestMapping(value = "user", method = RequestMethod.POST)
    public String saveUser(User user){
        userService.saveUser(user);
        return "redirect:/user/" + user.getId();
    }

    /**
     * Pulls information from the webpages to remove
     * a user in the database
     * @param id
     * @return
     */
    @RequestMapping("user/delete/{id}")
    public String delete(@PathVariable Integer id){
        userService.deleteUser(id);
        return "redirect:/users";
    }

}
