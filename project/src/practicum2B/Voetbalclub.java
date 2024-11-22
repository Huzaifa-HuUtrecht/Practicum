package practicum2B;

public class Voetbalclub {

    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String naam) {

        if (naam == null || naam.isEmpty()) {
             this.naam = "FC";
        } else {
            this.naam = naam;
        }

    }
    public String getNaam() {
        return naam;
    }

    public void verwerkResultaat(char ch) {

        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten() {
        return (aantalGewonnen * 3) + aantalGelijk;
    }

    public int getAantalGelijk() {
        return aantalGelijk;
    }

    public int getAantalVerloren() {
        return aantalVerloren;
    }

    public int getAantalGewonnen() {
        return aantalGewonnen;
    }

    public int aantalGespeeld() {
        return aantalGelijk + aantalGewonnen + aantalVerloren;
    }


    @Override
    public String toString() {
        return naam + "   " + aantalGespeeld() + "   " + aantalGewonnen + "   " + aantalGelijk + "   " + aantalVerloren + "   " + aantalPunten();
    }

}
