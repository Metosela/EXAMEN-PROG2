import org.example.Combattant;
import org.example.MatchOfficiels;
import org.example.MatchTitre;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LigueTest {
    @Test
    public void testMatchTitreVictoire() {
        Combattant c1 = new Combattant("1", "Rakoto", "Rija", "TheHammer", 80);
        Combattant c2 = new Combattant("2", "Rabeson", "Lita", "IronFist", 78);
        MatchTitre match = new MatchTitre("M1", LocalDate.now(), "Las Vegas", c1, c2, "Champion Poids Moyen");
        match.attribuerPoints(30, 25);
        match.terminer();

        assertEquals(1, c1.getTitres().size());
        assertTrue(c1.getTitres().contains("Champion Poids Moyen"));
    }

    @Test
    public void testMatchOfficielEgalite() {
        Combattant c1 = new Combattant("1", "Doe", "John", "TheHammer", 80);
        Combattant c2 = new Combattant("2", "Smith", "Jane", "IronFist", 78);
        MatchOfficiels match = new MatchOfficiels("M2", LocalDate.now(), "Tokyo", c1, c2);
        match.attribuerPoints(28, 28);
        match.terminer();

        assertEquals("TheHammer (0V, 0D, 1E)", c1.toString());
        assertEquals("IronFist (0V, 0D, 1E)", c2.toString());
    }
}
