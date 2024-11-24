package practicum4A;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String adres, int bouwjaar) {
        this.adres = adres;
        this.bouwjaar = bouwjaar;
    }

    public Persoon getHuisbaas() {
        return huisbaas;
    }

    public void setHuisbaas(Persoon huisbaas) {
        this.huisbaas = huisbaas;
    }

    @Override
    public String toString() {
        return "Huis " + adres + " is gebouwd in " + bouwjaar + "\nen heeft huisbaas " + huisbaas.toString();
    }
}
