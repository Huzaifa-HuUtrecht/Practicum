package practicum8;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfsInventaris(String nm, double bud) {
        this.bedrijfsnaam = nm;
        this.budget = bud;
    }

    public void schafAan(Goed g) {
        if (!alleGoederen.contains(g) && budget >= g.huidigeWaarde()) {
            alleGoederen.add(g);
            budget -= g.huidigeWaarde();
        } else {
            System.out.println("Aanschaf mislukt: onvoldoende budget of goed al aanwezig.");
        }
    }
//hier voeg ik ook aanpassingen
    public String toString() {
        StringBuilder sb = new StringBuilder("Invantaris:\n");

        for (Goed g : alleGoederen) {
            sb.append(g.toString()).append("\n");
        }
        return sb.toString();
    }
}