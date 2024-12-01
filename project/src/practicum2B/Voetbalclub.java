package practicum2B;

public class Voetbalclub {

    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam) {
        this.naam = naam;
        this.aantalGewonnen = 0;
        this.aantalGelijk = 0;
        this.aantalVerloren = 0;
    }

    public String getNaam() {
        return naam;
    }

    public int aantalGespeeld() {
        return aantalGelijk + aantalGewonnen + aantalVerloren;
    }

    public int aantalPunten() {
        return (aantalGewonnen * 3) + aantalGelijk;
    }

    public void verwerkResultaat(char ch) {

        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    @Override
    public String toString() {
        return naam + "   " + aantalGespeeld() + "   " + aantalGewonnen + "   " + aantalGelijk + "   " + aantalVerloren + "   " + aantalPunten();
    }

}
