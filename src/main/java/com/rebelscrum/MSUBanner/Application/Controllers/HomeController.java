package com.rebelscrum.MSUBanner.Application.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Home controller to pass info between the database
 * and html home page
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {return "Index";}




}