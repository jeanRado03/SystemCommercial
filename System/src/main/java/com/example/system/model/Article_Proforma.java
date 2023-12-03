package com.example.system.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@NoArgsConstructor
@Table(name="Article_Proforma")
public class Article_Proforma {
    @Id
    @Column(name="idAP")
    private String idAP;
    @ManyToOne
    @JoinColumn(name="idfournisseur")
    private Fournisseur fournisseur;
    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;
    @Column(name="prixht")
    private double prixHT;
    private double TVA;
    private Date emission;

    public String getIdAP() {
        return idAP;
    }

    public void setIdAP(String idAP) {
        this.idAP = idAP;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public double getTVA() {
        return TVA;
    }

    public void setTVA(double TVA) {
        this.TVA = TVA;
    }

    public Date getEmission() {
        return emission;
    }

    public void setEmission(Date emission) {
        this.emission = emission;
    }

    public Article_Proforma(Fournisseur fournisseur, Article article, double prixHT, double TVA, Date emission) {
        this.fournisseur = fournisseur;
        this.article = article;
        this.prixHT = prixHT;
        this.TVA = TVA;
        this.emission = emission;
    }
}
