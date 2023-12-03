package com.example.system.model;

import lombok.NoArgsConstructor;

import java.sql.Date;

@NoArgsConstructor
public class Proforma {
    private String numeroProforma;
    private Article_Proforma[] articles;
    private double totalHT;
    private double totalTVA;
    private double TTC;
    private Date valable;

    public String getNumeroProforma() {
        return numeroProforma;
    }

    public void setNumeroProforma(String numeroProforma) {
        this.numeroProforma = numeroProforma;
    }

    public Article_Proforma[] getArticles() {
        return articles;
    }

    public void setArticles(Article_Proforma[] articles) {
        this.articles = articles;
    }

    public double getTotalHT() {
        return totalHT;
    }

    public void setTotalHT(double totalHT) {
        this.totalHT = totalHT;
    }

    public double getTotalTVA() {
        return totalTVA;
    }

    public void setTotalTVA(double totalTVA) {
        this.totalTVA = totalTVA;
    }

    public double getTTC() {
        return TTC;
    }

    public void setTTC(double TTC) {
        this.TTC = TTC;
    }

    public Date getValable() {
        return valable;
    }

    public void setValable(Date valable) {
        this.valable = valable;
    }

    public Proforma(String numeroProforma, Article_Proforma[] articles, double totalHT, double totalTVA, double TTC, Date valable) {
        this.numeroProforma = numeroProforma;
        this.articles = articles;
        this.totalHT = totalHT;
        this.totalTVA = totalTVA;
        this.TTC = TTC;
        this.valable = valable;
    }
}
