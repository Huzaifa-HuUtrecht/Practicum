package practicum4B;

public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public AutoHuur() {
        this.aantalDagen = 0;
        this.gehuurdeAuto = null;
        this.huurder = null;
    }


    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }


    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs() {
        if (gehuurdeAuto == null || huurder == null) {
            return 0.0;
        }
        double basisPrijs = gehuurdeAuto.getPrijsPerDag() * getAantalDagen();
        double korting = (basisPrijs * huurder.getKorting()) / 100.0;

        return korting - basisPrijs;
    }

    @Override
    public String toString() {
        String result = "";

        if (gehuurdeAuto == null) {
            result += "er is geen auto bekend\n";
        } else {
            result += "autotype: " + gehuurdeAuto.toString() + "\n";
        }
        if (huurder == null) {
            result += "er is geen huurder bekend\n";
        } else {
            result += "op de naam van: " + huurder.toString() + "\n";
        }
       result += "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs() + "\n";
        return result;
    }
}
