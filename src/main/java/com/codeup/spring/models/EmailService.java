//package com.codeup.spring.models;
//
//import com.codeup.spring.models.Post;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.mail.MailException;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//@Service("mailService")
//public class EmailService {
//
//    @Autowired
//    public JavaMailSender emailSender;
//
//    @Value("${spring.mail.from}")
//    private String email;
//
//    public void prepareAndSend(Post post, String subject, String body) {
//        SimpleMailMessage emailMsg = new SimpleMailMessage();
//        emailMsg.setFrom(email);
//        emailMsg.setTo(post.getUser().getEmail());
//        emailMsg.setSubject(subject);
//        emailMsg.setText(body);
//
//        try {
//            this.emailSender.send(emailMsg);
//        } catch (MailException ex) {
//            System.err.println(ex.getMessage());
//        }
//
//    }
//}