package com.example.system.service;

import com.example.system.model.Employer;
import com.example.system.repository.EmployerRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class EmployerService {
    @Autowired
    EmployerRepository employerRepository;

    public Employer saveEmp(Employer emp) {
        int sequence = employerRepository.getNextVal();
        String id = employerRepository.getSequence(5,"EMP",sequence);
        emp.setIdEmp(id);
        return employerRepository.save(emp);
    }

    public List<Employer> getAllEmp() {
        return employerRepository.findAll();
    }
    public Employer getById(String id) {
        return employerRepository.findById(id).get();
    }
}
