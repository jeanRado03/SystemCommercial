package com.example.system.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employer")
public class Employer {
    @Id
    @Column(name="idemp")
    private String idEmp;
    @OneToOne
    @JoinColumn(name="idpersonne")
    private Personne personne;
}
