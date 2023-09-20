package com.example.job04.controller;

import com.example.job04.model.Person;
import com.example.job04.repository.PersonRepository;
import com.example.job04.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

    private final PersonService personService;

    public ViewController(PersonService personService) {
        this.personService = personService;
    }
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @PostMapping("/create")
    public String createPerson(@RequestParam String name, @RequestParam String age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);

        personService.addPerson(person);

        return "redirect:/user";
    }

    @GetMapping("/user")
    public String getUsers(Model model) {
        model.addAttribute("users", personService.findAll());

        return "user";
    }
}
