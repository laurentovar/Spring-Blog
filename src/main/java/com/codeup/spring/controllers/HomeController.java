//package com.codeup.spring.controllers;
//
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
////This class should have one method with a GetMapping for /.
//// It should return a string that says "This is the landing page!".
//@Controller
//public class HomeController {
//    //set up empty constructor
//
//    @GetMapping("/")
//    public String index(Model viewModel){
//        System.out.println((SecurityContextHolder.getContext().getAuthentication().getPrincipal()));
//        return "home";
//    }
//
//}
