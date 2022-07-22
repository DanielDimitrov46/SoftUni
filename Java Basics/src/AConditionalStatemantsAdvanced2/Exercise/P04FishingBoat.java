package AConditionalStatemantsAdvanced2.Exercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberOfFishers = Integer.parseInt(scanner.nextLine());
        double rent = 0;

        switch (season) {
            case "Spring":
                rent = 3000;
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                break;
            case "Winter":
                rent = 2600;
                break;
        }
        if (numberOfFishers <= 6) {
            rent *= 0.90;
        } else if (numberOfFishers > 7 && numberOfFishers <= 11) {
            rent *= 0.85;
        } else {
            rent *= 0.75;
        }

        if (numberOfFishers % 2 == 0 && !season.equals("Autumn")) {
            rent *= 0.95;
        }
        if (budget>=rent){
            System.out.printf("Yes! You have %.2f leva left.",budget-rent);
        }else{
            System.out.printf("Not enough money! You need %.2f leva.",rent-budget);
        }
    }
}
