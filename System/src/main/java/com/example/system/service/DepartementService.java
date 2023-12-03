package com.example.system.service;

import com.example.system.model.Departement;
import com.example.system.repository.DepartementRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class DepartementService {
    @Autowired
    DepartementRepository departementRepository;

    public Departement saveDepartement(Departement departement) {
        int sequence = departementRepository.getNextVal();
        String id = departementRepository.getSequence(5,"DEPT",sequence);
        departement.setIdDept(id);
        return departementRepository.save(departement);
    }

    public List<Departement> getAllDept() {
        return departementRepository.findAll();
    }

    public Departement getById(String idDept) {
        return departementRepository.findById(idDept).get();
    }
}
