package models;

import java.text.DecimalFormat;

public class Cageot {
    public static final int NOMBREDEBOUTEILLESMAX = 12;
    private final String identifiant;
    private Bouteille[] bouteilles;

    public Cageot(String identifiant) {
        this.identifiant = identifiant;
        bouteilles = new Bouteille[NOMBREDEBOUTEILLESMAX];
    }

    public void rangeBouteille(Bouteille nouvelleBouteille) {
        if (placeDisponible() != 0) {
            for (int i = 0; i < bouteilles.length; i++) {
                if (bouteilles[i] == null) {
                    bouteilles[i] = nouvelleBouteille;
                    break;
                }
            }
        }
    }

    public void prendreBouteille() {
        if (bouteilleStockee() != 0) {
            for (int i = 0; i < bouteilles.length; i++) {
                if (bouteilles[i] != null) {
                    bouteilles[i] = null;
                    break;
                }
            }
        }
    }

    public int placeDisponible() {
        int placeDispoInt = 0;
        for (int i = 0; i < bouteilles.length; i++) {
            if (bouteilles[i] == null) {
                placeDispoInt++;
            }
        }
        return placeDispoInt;
    }

    public int bouteilleStockee() {
        int placeUtiliseInt = 0;
        for (int i = 0; i < bouteilles.length; i++) {
            if (bouteilles[i] != null) {
                placeUtiliseInt++;
            }
        }
        return placeUtiliseInt;
    }

    public Bouteille[] listeBouteilles() {
        Bouteille[] nouvelleBouteilles = new Bouteille[bouteilleStockee()];
        int combientiemeBouteille = 0;
        for (int i = 0; i < bouteilles.length; i++) {
            if (bouteilles[i] != null) {
                nouvelleBouteilles[combientiemeBouteille] = bouteilles[i];
                combientiemeBouteille++;
            }
        }
        return nouvelleBouteilles;
    }

    public double prixTotal() {
        double prix = 0;
        for (int i = 0; i < bouteilles.length; i++) {
            if (bouteilles[i] != null) {
                prix = prix + bouteilles[i].getPrix();
            }
        }
        return prix;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public String toString() {
        DecimalFormat formatter = new DecimalFormat("00");
        return "Cageot '" + identifiant + "' avec " + formatter.format(bouteilleStockee()) + "/" + formatter.format(placeDisponible()) + " bouteilles";
    }
}
