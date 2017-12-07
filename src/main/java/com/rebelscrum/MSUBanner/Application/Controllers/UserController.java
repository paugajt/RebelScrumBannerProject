package com.rebelscrum.MSUBanner.Application.Controllers;

import com.rebelscrum.MSUBanner.Application.Entity.User;
import com.rebelscrum.MSUBanner.Application.Services.UserService;
import com.rebelscrum.MSUBanner.Application.Services.SecurityService;
import com.rebelscrum.MSUBanner.Application.Validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @RequestMapping(value ="/users", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("users", userService.listAllUsers());
        return "users";
    }

    @RequestMapping("user/{id}")
    public String showUser(@PathVariable Integer id, Model model){
        model.addAttribute("user", userService.getUserById(id));
        return "usershow";
    }

    @RequestMapping("user/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("user", userService.getUserById(id));
        return "userform";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult, Model model) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autologin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcome";
    }

    @RequestMapping("user/new")
    public String newUser(Model model){
        model.addAttribute("user", new User());
        return "userform";
    }

    @RequestMapping("user/login")
    public String loginUser(){
        return "login";
    }



  @RequestMapping(value = "user", method = RequestMethod.POST)
    public String saveUser(User user){
        userService.saveUser(user);
        return "redirect:/user/" + user.getId();
    }


    @RequestMapping("user/delete/{id}")
    public String delete(@PathVariable Integer id){
        userService.deleteUser(id);
        return "redirect:/users";
    }



}
