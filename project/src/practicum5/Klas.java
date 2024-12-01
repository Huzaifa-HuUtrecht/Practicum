package practicum5;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen = new ArrayList<>();

    public Klas(String kC) {
        this.klasCode = kC;
    }

    public void voegLeerlingToe(Leerling l) {
        leerlingen.add(l);
    }

    public void wijzigCijfer(String nm, double nweCijfer) {
        for (Leerling leerling : leerlingen) {
            if (leerling.getNaam().equals(nm)) {
                leerling.setCijfer(nweCijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public int aantalLeerlingen() {

        return leerlingen.size();
    }

    @Override
    public String toString() {
        String result = "In klas " + klasCode + " zitten de volgende leerlingen: \n";

        for (Leerling leerling : leerlingen) {
            result += leerling.toString();
        }

        return result;
    }
}
