package practicum8;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        this.framenummer = fnr;
    }

    @Override
    public double huidigeWaarde() {
        int huidigeJaar = java.time.Year.now().getValue();
        int jaren = huidigeJaar - super.bouwjaar;
        return super.nieuwprijs * Math.pow(0.9, jaren);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Fiets fiets = (Fiets) obj;
        return framenummer == fiets.framenummer;
    }
}
