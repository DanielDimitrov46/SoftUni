package examExercises;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfStatists = Integer.parseInt(scanner.nextLine());
        double priceForCloth = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.10;
        double priceForClothes = priceForCloth * numberOfStatists;
        if (numberOfStatists > 150) {
            priceForClothes *= 0.90;
        }
        double total = decor+priceForClothes;
        if(budget>=total){
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget-total);
        }else {
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.",total-budget);
        }
    }
}
