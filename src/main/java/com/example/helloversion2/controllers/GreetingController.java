package com.example.helloversion2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/greetings")
public class GreetingController {

    //localhost:8080/hello
    // endpoint handler metode
    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "hello world";
    }

    @GetMapping("/hello2")
    public ResponseEntity<String> sayHello2() {
        return new ResponseEntity<>("hello world", HttpStatus.OK);
    }



    /*@GetMapping("/vis")
    //@ResponseBody
    public String showHTMLpage() {
        return "show";
    }*/
}
