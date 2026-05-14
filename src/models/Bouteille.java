package models;

import java.text.DecimalFormat;

public class Bouteille {
    private final String nom;
    private final double prix;
    private final double contenance;
    private double remplissage;
    private final boolean enVerre;

    public Bouteille(String nom, double prix, double contenance, boolean enVerre) {
        this.nom = nom;
        this.prix = prix;
        this.contenance = contenance;
        remplissage = 100;
        this.enVerre = enVerre;
    }

    public String getNom() {
        return nom;
    }

    public double getContenance() {
        return contenance;
    }

    public double getPrix() {
        return prix;
    }

    public double getRemplissage() {
        return remplissage;
    }

    public boolean getEnVerre() {
        return enVerre;
    }
    public void setRemplissage(double remplissage) {
        this.remplissage = remplissage;
    }

    public String toString() {
        DecimalFormat prixFormatter = new DecimalFormat("#.##");
        String enVerreString = "";
        String remplissageString = "";
        if (enVerre == true) {
            enVerreString = "verre";
        } else {
            enVerreString = "plastique";
        }
        if (remplissage == 100) {
            remplissageString = "pleine";

        } else if (remplissage == 0) {
            remplissageString = "vide";
        } else if (remplissage < 100 && contenance > 0) {
            remplissageString = "entamée";
        } else {
            remplissageString = "Erreur";
        }
        return "Bouteille '" + nom + "' de " + contenance + "L en " + enVerreString + " à " + prixFormatter.format(prix) + " Frs - "
                + remplissageString;
    }
}
