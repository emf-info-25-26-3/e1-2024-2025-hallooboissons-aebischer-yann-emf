package models;

public class Commande {

    private final Client client;
    private final Cageot[] cageots;
    public static final int MAX_CAGEOTS = 8;

    public Commande(Client client) {
        this.client = client;
        this.cageots = new Cageot[MAX_CAGEOTS];
    }

    public void ajouterCageot(Cageot neauveuxCageot) {
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] == null) {
                cageots[i] = neauveuxCageot;
                break;
            }
        }
    }

    public void supprimerCageot(Cageot cageotASupprimer) {
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] == cageotASupprimer) {
                cageots[i] = null;
                break;
            }
        }
    }

    public void annuler() {
        for (int i = 0; i < cageots.length; i++) {
            cageots[i] = null;
        }
    }

    public Cageot[] listeCageotsALivrer() {
                int placeUtiliseInt = 0;
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] != null) {
                placeUtiliseInt++;
            }
        }
        Cageot[] nouvelleCageots = new Cageot[placeUtiliseInt];
        int combientiemeCageot = 0;
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] != null) {
                nouvelleCageots[combientiemeCageot] = cageots[i];
                combientiemeCageot++;
            }
        }
        return nouvelleCageots;
    }

    public double prixTotal() {
        double prix = 0;
        for (int i = 0; i < cageots.length; i++) {
            if (cageots[i] != null) {
                prix = prix + cageots[i].prixTotal();
            }
        }
        return prix;
    }

    public Client getClient() {
        return client;
    }
}
