package com.example.system.service;

import com.example.system.model.Departement_Employer;
import com.example.system.repository.Departement_EmployerRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class Departement_EmployerService {
    @Autowired
    private Departement_EmployerRepository departementEmployerRepository;

    public Departement_Employer saveDeptEmp(Departement_Employer deptEmp) {
        int sequence = departementEmployerRepository.getNextVal();
        String id = departementEmployerRepository.getSequence(5,"DEMP",sequence);
        deptEmp.setIdDE(id);
        return departementEmployerRepository.save(deptEmp);
    }

    public List<Departement_Employer> getAllDeptEmp() {
        return departementEmployerRepository.findAll();
    }

    public Departement_Employer getById(String id) {
        return departementEmployerRepository.findById(id).get();
    }
}
