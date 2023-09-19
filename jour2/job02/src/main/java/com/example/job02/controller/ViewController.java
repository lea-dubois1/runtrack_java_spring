package com.example.job02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    public String message = "Bonjour toi";

    @GetMapping("/")
    public String getPage() {
        return "view";
    }
    public String getMessage() {
        return this.message;
    }
    @GetMapping("/aurevoir")
    public String getAurevoir() {
        return "test";
    }
}
