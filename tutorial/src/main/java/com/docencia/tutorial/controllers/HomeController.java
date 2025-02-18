package com.docencia.tutorial.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Welcome to Spring Boot");
        model.addAttribute("subtitle", "A Spring Boot Eafit App");
        return "home/index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About us");
        model.addAttribute("subtitle", "About us");
        model.addAttribute("description", "This is an about page ...");
        model.addAttribute("author", "Developed by: José David Toro");
        return "home/about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact us");
        model.addAttribute("subtitle", "Contact us");
        model.addAttribute("email", "lamejortienda@gmail.com");
        model.addAttribute("address", "calle 10 Medellin, Colombia");
        model.addAttribute("phone", "+57 44 88 123");
        return "home/contact";
    }
}
