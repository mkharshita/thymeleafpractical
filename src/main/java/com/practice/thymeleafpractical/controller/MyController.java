package com.practice.thymeleafpractical.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @RequestMapping(value = "/about", method=RequestMethod.GET)
    public String about(Model model){
        model.addAttribute("name", "Harshita");
        model.addAttribute("currentDate", new Date().toString());
        return "about";
    }
    
    @GetMapping("/example-loop")
    public String iterateHandler(Model model) {
        List<String> names = List.of("Harshita","Shruti","Akshat");
        model.addAttribute("names", names);
        return "iterate";
    }

    @GetMapping("/condition")
    public String getMethodName(Model model) {
        model.addAttribute("isActive", true);
        model.addAttribute("gender", "F");
        List<Integer> numbers = List.of(45,78,90,56);
        model.addAttribute("myList", numbers);
        return "condition";
    }
    
    
}
