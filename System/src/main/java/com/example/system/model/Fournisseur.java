package com.example.system.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "fournisseur")
public class Fournisseur {
    @Id
    @Column(name="idfournisseur")
    private String idFournisseur;
    @OneToOne
    @JoinColumn(name="idpersonne")
    private Personne personne;
}
