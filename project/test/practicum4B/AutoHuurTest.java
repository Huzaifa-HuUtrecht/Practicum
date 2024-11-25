package practicum4B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {

    @Test
    void GeenAutoEnGeenHuurder_return0AlsTotaalprijs() {
        AutoHuur autoHuur = new AutoHuur();

        assertEquals(0.0, autoHuur.totaalPrijs());
    }

    @Test
    void GeenHuurderWelAuto_return0AlsTotaalprijs() {
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50.0);
        ah1.setGehuurdeAuto(a1);

        assertEquals(0.0, ah1.totaalPrijs());
    }

    @Test
    void WelHuurderGeenAuto_return0AlsTotaalprijs() {
        AutoHuur ah1 = new AutoHuur();
        Klant k = new Klant("Jan Jansen");
        ah1.setHuurder(k);

        assertEquals(0.0, ah1.totaalPrijs());
    }

    @Test
    void WelHuurderWelAuto_returnCorrecteAlsTotaalprijs() {
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50.0);
        Klant k = new Klant("Jan Jansen");
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);

        assertEquals(-200.0, ah1.totaalPrijs());
    }
    @Test
    void WelHuurderMetKortingWelAuto_returnCorrecteTotaalprijsMetKorting() {
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50.0);
        Klant k = new Klant("Jan Jansen");
        k.setKorting(10.0);
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);

        assertEquals(-180.0, ah1.totaalPrijs());
    }

    @Test
    void GeenDagenGehuurd_return0AlsTotaalprijs() {
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 50.0);
        Klant k = new Klant("Jan Jansen");
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(0);

        assertEquals(0.0, ah1.totaalPrijs());
    }

    @Test
    void AutoZonderPrijs_return0AlsTotaalprijs() {
        AutoHuur ah1 = new AutoHuur();
        Auto a1 = new Auto("Peugeot 207", 0.0);
        Klant k = new Klant("Jan Jansen");
        ah1.setHuurder(k);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(5);

        assertEquals(0.0, ah1.totaalPrijs());
    }

}