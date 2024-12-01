package practicum4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adr, int bwjr) {
        this.adres = adr;
        this.bouwjaar = bwjr;
    }

    public void setHuisbaas(Persoon hb) {
        this.huisbaas = hb;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    @Override
    public String toString() {
        return "Huis " + adres + " is gebouwd in " + bouwjaar + "\nen heeft huisbaas " + huisbaas.toString();
    }
}
