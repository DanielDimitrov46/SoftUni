package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class trainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double wToCm = w * 100;
        double hToCm = h * 100;
        double minusCorridor = hToCm - 100;
        double residueDesk = minusCorridor % 70;
        double residueRows = wToCm % 120;
        double desks = (minusCorridor - residueDesk) / 70;
        double rows = (wToCm - residueRows) / 120;
        double total = rows*desks-3;
        System.out.println(total);
    }
}
