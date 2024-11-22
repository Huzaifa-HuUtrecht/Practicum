package practicum2B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    @Test
    void test_voetbalclub_retrunNull() {

        Voetbalclub Club = new Voetbalclub(null);
        assertEquals("FC", Club.getNaam());
    }

    @Test
    void test_voetbalclub_retrunEmpty() {
        Voetbalclub Club = new Voetbalclub("");
        assertEquals("FC", Club.getNaam());
    }

    @Test
    void test_verwerkingResultaatWin() {
        Voetbalclub Club = new Voetbalclub("Ajax");
        Club.verwerkResultaat('w');
        assertEquals(1, Club.aantalGespeeld());
        assertEquals(1, Club.getAantalGewonnen());
        assertEquals(0, Club.getAantalGelijk());
        assertEquals(0, Club.getAantalVerloren());
        assertEquals(3, Club.aantalPunten());
    }
    @Test
    void test_verwerkingResultaatGelijk() {

    Voetbalclub Club = new Voetbalclub("Fynoord");
    Club.verwerkResultaat('g');

    assertEquals(1, Club.aantalGespeeld());
    assertEquals(0, Club.getAantalGewonnen());
    assertEquals(1, Club.getAantalGelijk());
    assertEquals(0, Club.getAantalVerloren());
    assertEquals(1, Club.aantalPunten());
    }

    @Test
    void test_verwerkingResultaatVerloren() {

        Voetbalclub Club = new Voetbalclub("Fynoord");
        Club.verwerkResultaat('v');

        assertEquals(1, Club.aantalGespeeld());
        assertEquals(0, Club.getAantalGewonnen());
        assertEquals(0, Club.getAantalGelijk());
        assertEquals(1, Club.getAantalVerloren());
        assertEquals(0, Club.aantalPunten());
    }
    @Test
    void test_ToString() {
    Voetbalclub Club = new Voetbalclub("Ajax");
    Club.verwerkResultaat('w');
    Club.verwerkResultaat('g');
    Club.verwerkResultaat('v');

    String expectedResult = "Ajax   3   1   1   1   4";
    assertEquals(expectedResult, Club.toString());
    }
}