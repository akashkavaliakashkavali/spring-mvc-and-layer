package com.akash.simplewebapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class Homecontroller {

    @RequestMapping("/")
    public String greet(){
        return "welcome my home";
    }

    @RequestMapping("/about")
    public String about(){
        return "about page will open";
    }
}
