package org.example;

import java.time.LocalDate;

public class MatchOfficiels extends Match {
    public MatchOfficiels(String id, LocalDate date, String endroit, Combattant c1, Combattant c2) {
        super(id, date, endroit, c1, c2);
    }

    @Override
    public void terminer() {
        if (points1 > points2) {
            combattant1.enregistrerVictoire();
            combattant2.enregistrerDefaite();
        } else if (points2 > points1) {
            combattant2.enregistrerVictoire();
            combattant1.enregistrerDefaite();
        } else {
            combattant1.enregistrerEgalite();
            combattant2.enregistrerEgalite();
        }
    }
}
