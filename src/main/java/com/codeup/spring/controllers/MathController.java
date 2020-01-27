package com.codeup.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

//listen for requests for several routes that correspond to
// basic arithmetic operations and produce the result of the arithmetic.
@Controller
public class MathController {

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public String add(@PathVariable int num1, @PathVariable int num2){
        int total = num1 + num2;
        return String.valueOf(total);
    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public String subtract(@PathVariable int num1, @PathVariable int num2){
        return String.valueOf(num1 - num2);
    }

    @GetMapping("/multiply/{num1}/by/{num2}")
    @ResponseBody
    public String multiply(@PathVariable int num1, @PathVariable int num2){
        return String.valueOf(num1 * num2);
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public String divide(@PathVariable double num1, @PathVariable double num2){

        //check to see if they are trying to divide a number by 0
        if(num2 == 0){
            return num1 + " cannot be divided by Zero";
        }

        return String.valueOf(num1 / num2);
    }

}