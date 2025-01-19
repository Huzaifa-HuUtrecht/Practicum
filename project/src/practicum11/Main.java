package practicum11;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("wat is de naam vam de bronbestand");
            String bronbestand = sc.nextLine();

            System.out.println("wat is het bestemmingsbestand");
            String bestemmingsbestand = sc.nextLine();

            System.out.println("wat is de waarde van  1 US dollar in Euro");
            String koersWaardeInput = sc.nextLine();

            double koersWaarde;
            try {
                koersWaarde = Double.parseDouble(koersWaardeInput) / 100;
            } catch (NumberFormatException e) {
                System.out.println("Ongeldige wisselkoers. Gebruik alleen numerieke waarden.");
                return;
            }
            BufferedReader reader = new BufferedReader(new FileReader(bronbestand));
            BufferedWriter writer = new BufferedWriter(new FileWriter(bestemmingsbestand));

            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" : ");

                if (parts.length == 2) {
                    String productNaam = parts[0];
                    double prijsUSD = Double.parseDouble(parts[1]);
                    double priceEUR = prijsUSD * koersWaarde;

                    writer.write(productNaam + " : " + String.format("%.2f", priceEUR));
                    writer.newLine();

                }
            }
            writer.close();
            System.out.println("Conversie voltooid! Gegevens opgeslagen in " + bestemmingsbestand);
        }catch (Exception e) {
            System.out.println("Er is een fout opgetreden: " + e.getMessage());
        }
    }
}
