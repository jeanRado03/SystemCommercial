package com.example.system.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name="departement_employer")
@NoArgsConstructor
public class Departement_Employer {
    @Id
    @Column(name="idDE")
    private String idDE;
    @ManyToOne
    @JoinColumn(name="iddepart")
    private Departement departement;
    @ManyToOne
    @JoinColumn(name="idemp")
    private Employer employer;
    private int role;

    public String getIdDE() {
        return idDE;
    }

    public void setIdDE(String idDE) {
        this.idDE = idDE;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public void setRole(String role) {
        switch (role){
            case "chef" :
                this.setRole(30);
                break;
            case "manager" :
                this.setRole(20);
                break;
            default:
                this.setRole(10);
        }
    }

    public Departement_Employer(Departement departement, Employer employer, String role) {
        this.setDepartement(departement);
        this.setEmployer(employer);
        this.setRole(role);
    }
}
