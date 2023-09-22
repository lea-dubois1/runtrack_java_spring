package com.example.job02.controller;

import com.example.job02.model.Person;
import com.example.job02.service.PersonService;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("person", new Person());
        return "index";
    }

    @PostMapping("/create")
    public String createPerson(@ModelAttribute Person person) {
        personService.addPerson(person);
        return "redirect:/listUsers";
    }

    @GetMapping("/listUsers")
    public String getUsers(Model model) {
        model.addAttribute("users", personService.findAll());
        return "listUsers";
    }
}
