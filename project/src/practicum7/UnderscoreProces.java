package practicum7;

public class UnderscoreProces implements OpmaakProces {

    @Override
    public String maakOp(String input) {
        return input.replaceAll(" ", "_");
    }
}
