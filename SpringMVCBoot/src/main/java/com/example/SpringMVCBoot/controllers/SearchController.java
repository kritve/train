package com.example.SpringMVCBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

    @GetMapping("/search")
    public String showSearchProductsToUser(@RequestParam("search") String search, Model main){
        System.out.println("User is looking for - " + search);

        return  "search";
    }

}
