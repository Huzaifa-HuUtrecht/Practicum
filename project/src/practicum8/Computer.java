package practicum8;

public class Computer implements Goed {
    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr) {
        this.type = tp;
        this.macAdres = adr;
        this.aanschafPrijs = pr;
        this.productieJaar = jr;
    }

    @Override
    public double huidigeWaarde() {
        int huidigeJaar = java.time.Year.now().getValue();
        int jaren = huidigeJaar - productieJaar;
        return aanschafPrijs * Math.pow(0.6, jaren);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer computer = (Computer) obj;
        return macAdres.equals(computer.macAdres);
    }

    @Override
    public String toString() {
        return String.format("Computer: %s heeft een waarde van: €%.2f", type, huidigeWaarde());
    }
}