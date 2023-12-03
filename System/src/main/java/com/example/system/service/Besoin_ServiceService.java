package com.example.system.service;

import com.example.system.model.Besoin;
import com.example.system.model.Besoin_Service;
import com.example.system.view.Groupement;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.system.repository.Besoin_ServiceRepository;

import java.util.List;

@Service
@Data
public class Besoin_ServiceService {
    @Autowired
    Besoin_ServiceRepository besoinServiceRepository;

    public Besoin_Service saveBesoinService(Besoin_Service besoin) {
        int sequence = besoinServiceRepository.getNextVal();
        String id = besoinServiceRepository.getSequence(5,"BSR",sequence);
        besoin.setIdBS(id);
        return besoinServiceRepository.save(besoin);
    }

    public void valideeBesoin(Besoin_Service besoin) {
        besoin.setEtat(20);
        besoinServiceRepository.save(besoin);
    }

    public void annuleeBesoin(Besoin_Service besoin) {
        besoin.setEtat(0);
        besoinServiceRepository.save(besoin);
    }

    public List<Besoin_Service> getAllBesoin() {
        return besoinServiceRepository.findAll();
    }

    public Besoin_Service getByIdBesoin(String id) {
        return besoinServiceRepository.findById(id).get();
    }

    public Iterable<Besoin> getBesoinValidee() {
        return besoinServiceRepository.getBesoinValidee();
    }

    public Iterable<Besoin_Service> getBesoinServiceValidee() {
        return besoinServiceRepository.getBesoinServiceValidee();
    }

    public Iterable<Groupement> getGroupementBesoin() {
        return besoinServiceRepository.getBesoinGroupement();
    }

    public Iterable<Besoin> getDetailBesoinNonValidee(String nature) {
        return besoinServiceRepository.getDetailBesoinNonValidee(nature);
    }
}
