package com.example.SpringMVCBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String showHomePage(){
        System.out.println("Showing Home Page");
        return "index";
    }


    @GetMapping("/goToSearch")
    public String showSearchPage(){
        System.out.println("User in Search Page");
        return "search";
    }

}
