package org.example;

import java.time.LocalDate;

public class Match {
    protected String id;
    protected LocalDate date;
    protected String endroit;
    protected Combattant combattant1;
    protected Combattant combattant2;
    protected int points1, points2;

    public Match(String id, LocalDate date, String endroit, Combattant c1, Combattant c2) {
        this.id = id;
        this.date = date;
        this.endroit = endroit;
        this.combattant1 = c1;
        this.combattant2 = c2;
    }

    public void attribuerPoints(int p1, int p2) {
        this.points1 = p1;
        this.points2 = p2;
    }

    public void terminer() {

    }
}
