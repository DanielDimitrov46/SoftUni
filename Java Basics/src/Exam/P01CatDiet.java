package Exam;

import java.util.Scanner;

public class P01CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int percentOfFat = Integer.parseInt(scanner.nextLine());
        int percentOfProtein = Integer.parseInt(scanner.nextLine());
        int percentOfCarbohydrate = Integer.parseInt(scanner.nextLine());
        int allCalories = Integer.parseInt(scanner.nextLine());
        int percentOfWater = Integer.parseInt(scanner.nextLine());

        double fatConvert = percentOfFat / 100.0;
        double proteinConvert = percentOfProtein / 100.0;
        double carboConvert = percentOfCarbohydrate / 100.0;
        double waterConvert = percentOfWater / 100.0;

        double allFat = (fatConvert * allCalories) / 9;
        double allProtein = (proteinConvert * allCalories) / 4;
        double allCarbo = (carboConvert * allCalories) / 4;
        double allKg = allFat + allProtein + allCarbo;
        double caloriesForOneGram = allCalories / allKg;
        double realFood = 1.00-waterConvert;
        double final1 =realFood*caloriesForOneGram;
        System.out.printf("%.4f",final1);


    }
}
