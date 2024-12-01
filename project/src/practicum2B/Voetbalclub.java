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

    public int aantalGespeeld() {
        return aantalGelijk + aantalGewonnen + aantalVerloren;
    }

    public int aantalPunten() {
        return (aantalGewonnen * 3) + aantalGelijk;
    }

    public void verwerkResultaat(char ch) {

        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        else if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        else if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
        else
            throw new IllegalArgumentException("Ongeldige invoer " + ch);
    }

    @Override
    public String toString() {
        return naam + "   " + aantalGespeeld() + "   " + aantalGewonnen + "   " + aantalGelijk + "   " + aantalVerloren + "   " + aantalPunten();
    }

}
