package com.example.system.controller;

import com.example.system.model.Departement_Employer;
import com.example.system.service.Departement_EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/deptempurl")
public class Departement_EmployerController {
    @Autowired
    public Departement_EmployerService deptEmpService;

    @PostMapping(path="/saveDeptEmp")
    public Departement_Employer saveDeptEmp(@RequestBody Departement_Employer departementEmployer) {
        return deptEmpService.saveDeptEmp(departementEmployer);
    }
}
