package com.codeup.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//This class should have one method with a GetMapping for /.
// It should return a string that says "This is the landing page!".
@Controller
public class HomeController {
    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return "This is the landing page!";
    }

}
