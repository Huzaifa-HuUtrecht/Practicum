package practicum2A;

public class Zwembad {
    private double breedte = 2.5;
    private double lengte = 2.5;
    private double diepte = 2.5;

    public Zwembad(double breedte, double lengte, double diepte) {
        this.breedte = breedte;
        this.lengte = lengte;
        this.diepte = diepte;
    }

    public double getBreedte() {
        return breedte;
    }

    public double getLengte() {
        return lengte;
    }

    public double getDiepte() {
        return diepte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setDiepte(double diepte) {
        this.diepte = diepte;
    }

    @Override
    public String toString() {
        return "Dit zwembad is " + breedte + " breed, " + lengte + " meter lang, " + diepte + " meter diep";
    }

    public double inhoud() {
    return breedte * lengte * diepte;
    }
}
