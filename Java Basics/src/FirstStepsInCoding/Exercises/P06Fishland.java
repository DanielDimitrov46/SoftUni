package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P06Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceSkumriq = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        double kgMidi = Double.parseDouble(scanner.nextLine());
        double pricePalamud = priceSkumriq + (priceSkumriq * 0.60);
        double priceSafrid = priceCaca + (priceCaca * 0.80);
        double priceMidi = 7.50;

        double totalPricePalamud = pricePalamud * kgPalamud;
        double totalPriceSafrid = priceSafrid * kgSafrid;
        double totalPriceMidi = priceMidi * kgMidi;
        double total = totalPricePalamud + totalPriceMidi + totalPriceSafrid;
        System.out.printf("%.2f", total);
    }
}
