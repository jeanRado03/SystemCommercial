package com.example.system.controller;

import com.example.system.model.Departement;
import com.example.system.service.DepartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/depturl")
public class DepartementController {
    @Autowired
    private DepartementService departementService;

    @PostMapping(path="/saveDept")
    public Departement saveDepartement(@RequestBody Departement departement) {
        return departementService.saveDepartement(departement);
    }
}
