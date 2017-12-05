package com.rebelscrum.MSUBanner.Application.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controls the home button
 */
@Controller
public class HomeController {
    /**
     *  * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @return
     */

    @RequestMapping("/")
    public String home() {return "Index";}




}