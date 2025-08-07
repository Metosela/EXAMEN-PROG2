package org.example;

import java.time.LocalDate;

public class MatchTitre extends Match {
    private String titre;

    public MatchTitre(String id, LocalDate date, String endroit, Combattant c1, Combattant c2, String titre) {
        super(id, date, endroit, c1, c2);
        this.titre = titre;
    }

    @Override
    public void terminer() {
        if (points1 > points2) {
            combattant1.enregistrerVictoire();
            combattant2.enregistrerDefaite();
            combattant1.ajouterTitre(titre);
        } else if (points2 > points1) {
            combattant2.enregistrerVictoire();
            combattant1.enregistrerDefaite();
            combattant2.ajouterTitre(titre);
        } else {
            combattant1.enregistrerEgalite();
            combattant2.enregistrerEgalite();
        }
    }
}
