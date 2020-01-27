package com.codeup.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    //Post the index page
    @RequestMapping(path = "/posts", method = RequestMethod.GET)
    @ResponseBody
    public String postIndexPage (@PathVariable int number) {
        return "Index of page" + number;
    }
    //View an individual post
    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String individualPost (@PathVariable int number) {
        return "Individual post" + number;
    }
    //View form for creating a post
    @RequestMapping(path = "/posts/create", method = RequestMethod.GET)
    @ResponseBody
    public String viewPost (@PathVariable int number) {
        return "Individual post" + number;
    }
    //Create a new post
    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String createPost (@PathVariable String title, String description) {
        return "Individual post is " + title + description;
    }
}
