package practicum8;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt) {
        super(tp, pr, jr);
        this.kenteken = kt;
    }

    @Override
    public double huidigeWaarde() {
        int huidigeJaar = java.time.Year.now().getValue();
        int jaren = huidigeJaar - super.bouwjaar;
        return super.nieuwprijs * Math.pow(0.7, jaren);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;

        Auto auto = (Auto) obj;
        return kenteken.equals(auto.kenteken);
    }
}
