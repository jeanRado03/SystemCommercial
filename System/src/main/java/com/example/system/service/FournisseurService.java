package com.example.system.service;

import com.example.system.model.Fournisseur;
import com.example.system.repository.FournisseurRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class FournisseurService {
    @Autowired
    FournisseurRepository fournisseurRepository;

    public Fournisseur saveFournisseur(Fournisseur fournisseur) {
        int sequence = fournisseurRepository.getNextVal();
        String id = fournisseurRepository.getSequence(5,"FRS",sequence);
        fournisseur.setIdFournisseur(id);
        return fournisseurRepository.save(fournisseur);
    }

    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    public Fournisseur getByIdFournisseur(String id) {
        return fournisseurRepository.findById(id).get();
    }
}
