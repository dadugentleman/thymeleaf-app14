package com.example.thymeleaf_app.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // metoda pentru a afiasa formuralul HTML initial

    @RequestMapping("/showForm")
    public String showForm() {
        return "hellowolrd-form";
    }
}
