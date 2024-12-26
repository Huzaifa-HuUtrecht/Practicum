package practicum8;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String tp, double pr, int jr) {
        this.type = tp;
        this.nieuwprijs = pr;
        this.bouwjaar = jr;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Voertuig) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Voertuig voertuig = (Voertuig) obj;
        return type.equals(voertuig.type) && bouwjaar == voertuig.bouwjaar;
    }

    @Override
    public String toString() {
        return String.format("Voertuig: %s met bouwjaar: %d heeft waarde van €%.2f", type, bouwjaar, huidigeWaarde());
    }
}
