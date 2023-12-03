package com.example.system.controller;

import com.example.system.model.Besoin;
import com.example.system.model.Besoin_Service;
import com.example.system.service.Besoin_ServiceService;
import com.example.system.view.Groupement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/besoinurl")
public class Besoin_ServiceController {
    @Autowired
    private Besoin_ServiceService besoinServService;

    @PostMapping(path="/savebesoinService")
    public Besoin_Service saveBesoinService(@RequestBody Besoin_Service besoinService) {
        return besoinServService.saveBesoinService(besoinService);
    }

    @PutMapping(path="/valideeBesoin/{idBS}")
    public void updateSBesoin(@PathVariable String idBS) {
        Besoin_Service besoin = besoinServService.getByIdBesoin(idBS);
        besoinServService.valideeBesoin(besoin);
    }

    @PutMapping(path="/annuleeBesoin/{idBS}")
    public void annuleeSBesoin(@PathVariable String idBS) {
        Besoin_Service besoin = besoinServService.getByIdBesoin(idBS);
        besoinServService.annuleeBesoin(besoin);
    }

    @GetMapping(path="/besoinValidees")
    public Iterable<Besoin> getBesoinValidees() {
        return besoinServService.getBesoinValidee();
    }

    @GetMapping(path="/besoinServiceValidees")
    public Iterable<Besoin_Service> getBesoinServiceValidees() {
        return besoinServService.getBesoinServiceValidee();
    }

    @GetMapping(path="/getBesoinGroupBy")
    public Iterable<Groupement> getGroupement() {
        return besoinServService.getGroupementBesoin();
    }

    @GetMapping(path="/getDetailBesoin/{nature}")
    public Iterable<Besoin> getDetailBesoinNonValidee(@PathVariable String nature) {
        return besoinServService.getDetailBesoinNonValidee(nature);
    }
}
