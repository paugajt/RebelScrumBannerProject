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


/**
 * controller for users.
 */
@Controller
public class UserController {
    /**
     *
     */

    private UserService userService;

    /**
     * service.
     * @param userService
     */
    @Autowired
    public void setUserService(UserService userService) {this.userService = userService;}
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;



    /**
     * list function
     * @param model
     * @return users
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("users", userService.listAllUsers());
        return "users";
    }

    /**
     * show user
     * @param id
     * @param model
     * @return user
     */
    @RequestMapping("user/{id}")
    public String showUser(@PathVariable Integer id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "usershow";
    }

    /**
     * edit user
     * @param id
     * @param model
     * @return user form
     */
    @RequestMapping("user/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "userform";
    }

    /**
     * create user
     * @param model
     * @return user
     */
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
    public String newUser(Model model) {
        model.addAttribute("user", new User());
        return "userform";
    }


    /**
     * login function.
     * @return login
     */
    @RequestMapping("user/login")
    public String loginUser() {
        return "login";
    }

    /**
     * save user .
     * @param user
     * @return user
     */
  @RequestMapping(value = "user", method = RequestMethod.POST)
    public String saveUser(User user) {
        userService.saveUser(user);
        return "redirect:/user/" + user.getId();
    }

    /**
     * delete user.
     * @param id
     * @return redirect
     */
    @RequestMapping("user/delete/{id}")
    public String delete(@PathVariable Integer id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }

}
