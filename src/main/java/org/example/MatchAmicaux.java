package org.example;

import java.time.LocalDate;

public class MatchAmicaux extends Match {
    public MatchAmicaux(String id, LocalDate date, String endroit, Combattant c1, Combattant c2) {
        super(id, date, endroit, c1, c2);
    }

    @Override
    public void terminer() {}
}
