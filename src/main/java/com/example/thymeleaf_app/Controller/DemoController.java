package com.example.thymeleaf_app.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class DemoController {

    // aici vom crea mapping-up pentur "/hello"
    @GetMapping("/hello")
    public String sayHello(Model theModel) {

        theModel.addAttribute("theDate", java.time.LocalDateTime.now());


        return "helloworld";
    }

}
