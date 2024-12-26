package practicum8;

public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris inventaris = new BedrijfsInventaris("HU Bedrijf", 100000);

        Computer pc1 = new Computer("Laptop", "1234567", 1200, 2020);
        Computer pc2 = new Computer("Laptop", "1234567", 1200, 2020);
        Computer pc3 = new Computer("Desktop", "1234567", 800, 2021);

        Auto auto1 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto auto2 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto auto3 = new Auto("Tesla Model 3", 49999.00, 2022, "5-ABC-123");

        Fiets fiets1 = new Fiets("Gazelle", 1200, 2020, 12345);
        Fiets fiets2 = new Fiets("Gazelle", 1200, 2020, 12345);
        Fiets fiets3 = new Fiets("Chamonix", 800, 2021, 67890);

        inventaris.schafAan(pc1);
        inventaris.schafAan(pc2);
        inventaris.schafAan(pc3);
        inventaris.schafAan(auto1);
        inventaris.schafAan(auto2);
        inventaris.schafAan(auto3);

        inventaris.schafAan(fiets1);
        inventaris.schafAan(fiets2);
        inventaris.schafAan(fiets3);

        System.out.println(inventaris);
    }
}
