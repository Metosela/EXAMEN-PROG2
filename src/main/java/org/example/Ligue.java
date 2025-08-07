package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ligue {
    private String nom;
    private List<Combattant> combattants;
    private List<Match> matchs;

    public Ligue(String nom) {
        this.nom = nom;
        this.combattants = new ArrayList<>();
        this.matchs = new ArrayList<>();
    }

    public void ajouterCombattant(Combattant c) {
        combattants.add(c);
    }

    public void ajouterMatch(Match m) {
        matchs.add(m);
    }

    public List<Match> getMatchsPourCombattant(String idCombattant) {
        List<Match> resultats = new ArrayList<>();
        for (Match m : matchs) {
            if (m.combattant1.getId().equals(idCombattant) || m.combattant2.getId().equals(idCombattant)) {
                resultats.add(m);
            }
        }
        return resultats;
    }
}
