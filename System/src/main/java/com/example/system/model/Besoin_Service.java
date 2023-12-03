package com.example.system.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name="besoin_service")
@NoArgsConstructor
public class Besoin_Service {
    @Id
    @Column(name="idBS")
    private String idBS;
    @ManyToOne
    @JoinColumn(name="iddept")
    private Departement departement;
    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;
    private double quantite;
    private String unite;
    private String motifs;
    private int etat;

    public String getIdBS() {
        return idBS;
    }

    public void setIdBS(String idBS) {
        this.idBS = idBS;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public String getMotifs() {
        return motifs;
    }

    public void setMotifs(String motifs) {
        this.motifs = motifs;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public void setEtat(String etat) {
        switch (etat) {
            case "validee" :
                this.setEtat(20);
                break;
            case "annulee" :
                this.setEtat(0);
                break;
            default :
                this.setEtat(10);
        }
    }

    public Besoin_Service(Departement departement, Article article, double quantite, String unite, String motifs, String etat) {
        this.setDepartement(departement);
        this.setArticle(article);
        this.setQuantite(quantite);
        this.setUnite(unite);
        this.setMotifs(motifs);
        this.setEtat(etat);
    }
}
