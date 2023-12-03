package com.example.system.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name="personne")
public class Personne {
    @Id
    @Column(name="idpersonne")
    private String idPersonne;
    private String nom;
    private String prenom;
    @Column(name="datenaissance")
    private Date dateNaissance;
    private String genre;
    private String mail;
    private String phone;
}