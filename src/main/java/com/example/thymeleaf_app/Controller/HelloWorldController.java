package com.example.thymeleaf_app.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // metoda pentru a afiasa formuralul HTML initial

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";

    }

    // metoda care se ocupa de procesare datelor din formularul HTML

    @GetMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }
}
