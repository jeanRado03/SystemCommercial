package com.example.system.service;

import com.example.system.model.Personne;
import com.example.system.repository.PersonneRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class PersonneService {
    @Autowired
    PersonneRepository personneRepository;

    public Personne savePersonne(Personne personne) {
        int sequence = personneRepository.getNextVal();
        String id = personneRepository.getSequence(5,"PER",sequence);
        personne.setIdPersonne(id);
        System.out.println("Misy ve");
        return personneRepository.save(personne);
    }

    public List<Personne> getAllPersonne() {
        return personneRepository.findAll();
    }

}
