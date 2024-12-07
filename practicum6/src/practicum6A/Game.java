package practicum6A;

import java.time.Year;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String nm, int rJ, double nwpr) {
        this.naam = nm;
        this.releaseJaar = rJ;
        this.nieuwprijs = nwpr;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        int huidigeJaar = Year.now().getValue();
        int aantalJaar = huidigeJaar - releaseJaar;

        if (aantalJaar < 0) {
            aantalJaar = 0;
        }
        return this.nieuwprijs * Math.pow(0.7, aantalJaar);
    }

    public boolean equals(Object andereObject) {
        if (this == andereObject) {
            return true;
        }
        if (!(andereObject instanceof Game)) {
            return false;
        }
        Game game = (Game) andereObject;

        return this.naam.equals(game.naam) && this.releaseJaar == game.releaseJaar;
    }

    @Override
    public String toString() {
        return naam + ", uitgegeven in " + releaseJaar + "; nieuwprijs: €" + String.format("%.2f", nieuwprijs) + " nu voor: €" + String.format("%.2f", huidigeWaarde());
    }
}
