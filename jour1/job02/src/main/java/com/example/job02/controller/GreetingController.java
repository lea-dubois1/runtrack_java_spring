package com.example.job02.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @Value("${greeting.message}")
    private String message;

    @GetMapping("/")
    @ResponseBody
    public String greetings() {
        return message;
    }
}
