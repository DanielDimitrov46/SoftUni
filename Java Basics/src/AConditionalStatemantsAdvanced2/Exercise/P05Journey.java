package AConditionalStatemantsAdvanced2.Exercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String type = "";
        double moneyToSpend = 0;
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                moneyToSpend = budget * 0.30;
                type = "Camp";
            } else {
                moneyToSpend = budget * 0.70;
                type = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                moneyToSpend = budget * 0.40;
                type = "Camp";
            } else {
                moneyToSpend = budget * 0.80;
                type = "Hotel";
            }
        } else {
            destination = "Europe";
            moneyToSpend = budget*0.90;
            type = "Hotel";
        }
        System.out.printf("Somewhere in %s%n",destination);
        System.out.printf("%s - %.2f",type,moneyToSpend);
    }
}
