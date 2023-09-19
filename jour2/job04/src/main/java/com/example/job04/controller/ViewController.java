package com.example.job04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {
    @GetMapping("/")
    public String getHome() {
        return "view";
    }
    @PostMapping("/")
    @ResponseBody
    public String getMessage(@RequestParam String nom) {
        return "Bonjour, " + nom;
    }
}
