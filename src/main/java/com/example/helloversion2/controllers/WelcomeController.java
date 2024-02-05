package com.example.helloversion2.controllers;

import com.example.helloversion2.models.Message;
import com.example.helloversion2.services.WelcomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kea")
public class WelcomeController {

    private WelcomeService welcomeService = new WelcomeService();

    @GetMapping("/velkommen/{id}")
    public ResponseEntity<Message> sayWelcome(@PathVariable int id) {
            Message msg = welcomeService.sayWelcome(id);
            return new ResponseEntity<>(msg, HttpStatus.OK);
    }
}
