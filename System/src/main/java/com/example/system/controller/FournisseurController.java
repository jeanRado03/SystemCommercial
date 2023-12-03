package com.example.system.controller;

import com.example.system.model.Fournisseur;
import com.example.system.service.FournisseurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/fournisseururl")
public class FournisseurController {
    @Autowired
    private FournisseurService fournisseurService;

    @PostMapping(path="/saveFournisseur")
    public Fournisseur saveFournisseur(@RequestBody Fournisseur fournisseur) {
        return fournisseurService.saveFournisseur(fournisseur);
    }
}
