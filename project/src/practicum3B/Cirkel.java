package practicum3B;

public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;


    public Cirkel(int radius, int xPositie, int yPositie) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive integer");
        }
        this.radius = radius;
        this.xPositie = xPositie;
        this.yPositie = yPositie;
    }

    @Override
    public String toString() {
        return "Cirkel (" +xPositie + ", " + yPositie + ")" + " met radius: " + radius;
    }
}
