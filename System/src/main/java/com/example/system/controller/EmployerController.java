package com.example.system.controller;

import com.example.system.model.Employer;
import com.example.system.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/emp")
public class EmployerController {
    @Autowired
    private EmployerService employerService;

    @PostMapping(path="/saveEmp")
    public Employer saveEmp(@RequestBody Employer employer) {
        return employerService.saveEmp(employer);
    }
}
