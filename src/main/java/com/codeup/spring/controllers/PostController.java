package com.codeup.spring.controllers;

import com.codeup.spring.models.Post;
import com.codeup.spring.models.User;
import com.codeup.spring.repositories.PostRepository;
import com.codeup.spring.repositories.UserRepository;
//import com.codeup.spring.models.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    private final PostRepository postDao;
    private final UserRepository userDao;


    public PostController(PostRepository postDao, UserRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;

    }
//    @Autowired
//    EmailService emailService;


    @GetMapping("/")
    public String index() {
        System.out.println((SecurityContextHolder.getContext().getAuthentication().getPrincipal()));
        return "/posts/index";
    }

    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "/posts/show";
    }

    @GetMapping("posts/{id}/edit")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        model.addAttribute("post", postDao.getOne(id));
        return "/posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String update(@PathVariable long id, @RequestParam String title, @RequestParam String body) {
        Post oldAd = postDao.getOne(id);
        oldAd.setTitle(title);
        oldAd.setDescription(body);
        postDao.save(oldAd);
        return "redirect:/posts/";
    }

    @PostMapping("/posts/{id}/delete")
    public String delete(@PathVariable long id) {
        postDao.deleteById(id);
        return "redirect:/posts/";
    }

    @GetMapping("/posts/create")
    public String showCreateForm(Model vModel){
        vModel.addAttribute("post",new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String create(@ModelAttribute Post postToBeCreated) {
        User currentUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        postToBeCreated.setUser(currentUser);
        postDao.save(postToBeCreated);
//        emailService.prepareAndSend(postToBeCreated, "add created", "a add has been created and the id attached to said ad is  "+ postToBeCreated.getId());
        return "redirect:/posts/";

    }


}