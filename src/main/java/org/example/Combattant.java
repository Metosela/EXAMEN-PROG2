package org.example;

import java.util.ArrayList;
import java.util.List;

public class Combattant {
    private String id;
    private String nom;
    private String prenom;
    private String nomCombattant;
    private double poids;
    private List<String> titres;
    private int victoires, defaites, egalites;

    public Combattant(String id, String nom, String prenom, String nomCombattant, double poids) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomCombattant = nomCombattant;
        this.poids = poids;
        this.titres = new ArrayList<>();
    }

    public void ajouterTitre(String titre) {
        titres.add(titre);
    }

    public void enregistrerVictoire() {
        victoires++;
    }

    public void enregistrerDefaite() {
        defaites++;
    }

    public void enregistrerEgalite() {
        egalites++;
    }

    public String getId() {
        return id;
    }

    public List<String> getTitres() {
        return titres;
    }

    @Override
    public String toString() {
        return nomCombattant + " (" + victoires + "V, " + defaites + "D, " + egalites + "E)";
    }
}

