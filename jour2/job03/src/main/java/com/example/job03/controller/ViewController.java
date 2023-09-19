package com.example.job03.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ViewController {
    @GetMapping("/")
    public String getPage() {
        return "view";
    }
    public List<Personnes> persons = Arrays.asList(
            new Personnes("Lea", 20),
            new Personnes("Corentin", 26),
            new Personnes("Fabien", 28)
    );
}
