package com.example.job05.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ViewController {

    public static String message;
    @GetMapping("/view")
    public String getHome() {
        return "view";
    }
    @PostMapping("/view")
    public void getMessage(@RequestParam String nom, @RequestParam String birth) {
        message = checkInput(nom, birth).equals("ok") ? "Bonjour, " + nom + ". Vous etes né le " + birth : "Veuillez remplir tous les champs";
    }

    public String checkInput(String name, String date) {
        if (name == null || name.isEmpty() || date == null || date.isEmpty()) {
            return "vide";
        }else{
            return "ok";
        }
    }
}

