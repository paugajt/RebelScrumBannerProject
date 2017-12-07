package com.rebelscrum.MSUBanner.Application.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controls the home button.
 */
@Controller
public class HomeController {
    /**
     *  * * Will pull information from the webpages to create a
     * new class to be store into the database.
     * @return index
     */

    @RequestMapping("/")
    public String home() {
        return "Index"; }




}