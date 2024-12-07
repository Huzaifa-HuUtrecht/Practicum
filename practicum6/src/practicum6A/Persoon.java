package practicum6A;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames = new ArrayList<Game>();

    public Persoon(String nm, double bud) {
        this.naam = nm;
        this.budget = bud;
        this.mijnGames = new ArrayList<Game>();
    }

    public double getBudget() {
        return budget;
    }

    public boolean koop(Game g) {
        if (!mijnGames.contains(g) && g.huidigeWaarde() <= budget) {
            mijnGames.add(g);

            budget -= g.huidigeWaarde();
            return true;
        }
        return false;
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (!mijnGames.contains(g)) {
            return false;
        }
        if (koper.mijnGames.contains(g)) {
            return false;
        }

        if (koper.budget < g.huidigeWaarde()) {

            return false;
        }
        koper.mijnGames.add(g);
        koper.budget -= g.huidigeWaarde();
        mijnGames.remove(g);
        budget += g.huidigeWaarde();

        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(naam + " heeft een budget van €" + String.format("%.2f", budget) + " en bezit de volgende games:");

        if (mijnGames.isEmpty()) {
        } else {
            for (Game g : mijnGames) {
                result.append("\n" + g.toString());
            }
        }

        return result.toString();
    }
}
