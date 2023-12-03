package com.example.system.controller;

import com.example.system.model.Personne;
import com.example.system.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/personneurl")
public class PersonneController {
    @Autowired
    private PersonneService personneService;

    @PostMapping(path="/savePersonne")
    public Personne savePersonne(@RequestBody Personne personne) {
        System.out.println("Ato");
        return personneService.savePersonne(personne);
    }
}