package com.example.system.model;

public class Besoin {
    private String idbs;
    private double quantite;
    private String unite;
    private String designation;
    private String nature;

    public String getIdbs() {
        return idbs;
    }

    public void setIdbs(String idBS) {
        this.idbs = idBS;
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

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public Besoin(String idBS, double quantite, String unite, String designation, String nature) {
        this.setIdbs(idBS);
        this.setQuantite(quantite);
        this.setUnite(unite);
        this.setDesignation(designation);
        this.setNature(nature);
    }
}
