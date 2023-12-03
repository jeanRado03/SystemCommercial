package com.example.system.model;

import java.sql.Date;

public class BonCommande extends Proforma{
    private String conditionLivraison;
    private String modePaiement;

    public String getConditionLivraison() {
        return conditionLivraison;
    }

    public void setConditionLivraison(String conditionLivraison) {
        this.conditionLivraison = conditionLivraison;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public BonCommande(String numeroProforma, Article_Proforma[] articles, double totalHT, double totalTVA, double TTC, Date valable, String conditionLivraison, String modePaiement) {
        super(numeroProforma, articles, totalHT, totalTVA, TTC, valable);
        this.conditionLivraison = conditionLivraison;
        this.modePaiement = modePaiement;
    }
}
