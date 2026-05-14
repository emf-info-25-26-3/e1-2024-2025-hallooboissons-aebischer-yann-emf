package app;

import models.Bouteille;
import models.Cageot;
import models.Client;
import models.Commande;

public class Application {

    public static void main(String[] args) {
        Client client1 = new Client("DUCOBU", "Jean", "Bulle");
        Cageot cageot1 = new Cageot("X83H4");
        Bouteille bouteille1 = new Bouteille("Henniez rouge", 2.6, 1, true);
        Bouteille bouteille2 = new Bouteille("Henniez verte", 2.6, 1, true);
        for (int i = 0; i < 6; i++) {
            cageot1.rangeBouteille(bouteille1);
            cageot1.rangeBouteille(bouteille2);
        }
        Cageot cageot2 = new Cageot("X83H5");
        Bouteille bouteille3 = new Bouteille("Coca-Cola", 3.85, 1.5, false);
        for (int i = 0; i < 2; i++) {
            cageot2.rangeBouteille(bouteille3);
        }
        Cageot cageot3 = new Cageot("X83H6");
        Bouteille bouteille4 = new Bouteille("Pepsi", 3.55, 1.5, false);
        Bouteille bouteille5 = new Bouteille("Sinalco", 4.25, 1.5, false);
        cageot3.rangeBouteille(bouteille4);
        cageot3.rangeBouteille(bouteille5);
        Commande commande1 = new Commande(client1);
        commande1.ajouterCageot(cageot1);
        commande1.ajouterCageot(cageot2);
        commande1.ajouterCageot(cageot3);
        afficherCommande(commande1);

        Client client2 = new Client("HARONI", "Mac", "Fribourg");
        Cageot cageot4 = new Cageot("X83H7");
        cageot4.rangeBouteille(bouteille1);
        for (int i = 0; i < 2; i++) {
            cageot4.rangeBouteille(bouteille3);
        }
        Commande commande2 = new Commande(client2);
        commande2.ajouterCageot(cageot4);

        afficherCommande(commande2);
        //
        // ) ( ) ( ( (
        // ( /( * ))\ ) ( ( /( )\ ) )\ ) ( )\ )
        // ( ( )\())` ) /(()/(( )\ )\()|()/( ( (()/( )\ (()/(
        // )\ )((_)\ ( )(_))(_))\ (((_|(_)\ /(_)) )\ /(_)|((_) /(_))
        // ((_)((_)((_)(_(_()|_))((_) )\___ ((_|_))_ ((_) (_)) )\___(_))
        // __ _____ _____ ___ ___ ___ ___ ___ ___ ___ ___ ___ _
        // \ \ / / _ \_ _| _ \ __| / __/ _ \| \| __| |_ _/ __|_ _| | |
        // \ V / (_) || | | / _| | (_| (_) | |) | _| | | (__ | | |_|
        // \_/ \___/ |_| |_|_\___| \___\___/|___/|___| |___\___|___| (_)
        //

    }

    public static void afficherCommande(Commande commande) {
        if (commande != null) {
            System.out.println("-----------------------------");
            System.out.println("Commande pour le client : " + commande.getClient());
            Cageot[] cageotsALivrer = commande.listeCageotsALivrer();
            System.out.println("La commande contient " + cageotsALivrer.length + " cageots");
            System.out.println("Le prix total de la commande est de " + commande.prixTotal() + " Frs");
        }
    }
    //
    // ) ( ) ( ( (
    // ( /( * ))\ ) ( ( /( )\ ) )\ ) ( )\ )
    // ( ( )\())` ) /(()/(( )\ )\()|()/( ( (()/( )\ (()/(
    // )\ )((_)\ ( )(_))(_))\ (((_|(_)\ /(_)) )\ /(_)|((_) /(_))
    // ((_)((_)((_)(_(_()|_))((_) )\___ ((_|_))_ ((_) (_)) )\___(_))
    // __ _____ _____ ___ ___ ___ ___ ___ ___ ___ ___ ___ _
    // \ \ / / _ \_ _| _ \ __| / __/ _ \| \| __| |_ _/ __|_ _| | |
    // \ V / (_) || | | / _| | (_| (_) | |) | _| | | (__ | | |_|
    // \_/ \___/ |_| |_|_\___| \___\___/|___/|___| |___\___|___| (_)
    //

}
