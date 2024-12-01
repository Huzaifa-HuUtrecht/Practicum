package practicum3A;

import org.junit.jupiter.api.Test;
import practicum2B.Voetbalclub;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest  {

    @Test
    void testClubNaamNullOrEmpty() {
        Voetbalclub club1 = new Voetbalclub(null);
        Voetbalclub club2 = new Voetbalclub("");

        assertEquals("FC", club1.getNaam());
        assertEquals("FC", club2.getNaam());
    }

    @Test
    void testVerwerkResultaat() {
        Voetbalclub club = new Voetbalclub("Ajax");

        club.verwerkResultaat('w');
        assertEquals(3, club.aantalPunten());
        assertEquals(1, club.aantalGespeeld());

        club.verwerkResultaat('g');
        assertEquals(4, club.aantalPunten());
        assertEquals(2, club.aantalGespeeld());

        club.verwerkResultaat('v');
        assertEquals(4, club.aantalPunten());
        assertEquals(3, club.aantalGespeeld());
    }

    @Test
    void testFoutieveInvoer() {
        Voetbalclub club = new Voetbalclub("Feyenoord");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            club.verwerkResultaat('x');
        });
        assertEquals("Ongeldige invoer x", exception.getMessage());

        assertEquals(0, club.aantalPunten());
        assertEquals(0, club.aantalGespeeld());
    }

    @Test
    void testOptellingVanResultaten() {
        Voetbalclub club = new Voetbalclub("PSV");

        club.verwerkResultaat('w');
        club.verwerkResultaat('g');
        club.verwerkResultaat('v');
        club.verwerkResultaat('w');

        assertEquals(2, club.aantalGespeeld() - (1 + 1));
        assertEquals(7, club.aantalPunten());
        assertEquals("PSV         4 2 1 1 7", club.toString());
    }
}