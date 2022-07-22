package AConditionalStatemantsAdvanced2.Exercise;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double pricePerFlower = 0;
        double totalPrice = 0;
        switch (flower) {
            case "Roses":
                pricePerFlower = 5;
                totalPrice = pricePerFlower * numberFlowers;
                if (numberFlowers > 80) {
                    totalPrice -= totalPrice * 0.10;
                }
                break;
            case "Dahlias":
                pricePerFlower = 3.80;
                totalPrice = pricePerFlower * numberFlowers;
                if (numberFlowers > 90) {
                    totalPrice -= totalPrice * 0.15;
                }
                break;
            case "Tulips":
                pricePerFlower = 2.80;
                totalPrice = pricePerFlower * numberFlowers;
                if (numberFlowers > 80) {
                    totalPrice -= totalPrice * 0.15;
                }
                break;
            case "Narcissus":
                pricePerFlower = 3;
                totalPrice = pricePerFlower * numberFlowers;
                if (numberFlowers < 120) {
                    totalPrice += totalPrice * 0.15;
                }
                break;
            case "Gladiolus":
                pricePerFlower = 2.50;
                totalPrice = pricePerFlower * numberFlowers;
                if (numberFlowers < 80) {
                    totalPrice += totalPrice * 0.20;
                }
                break;
        }
        if (budget>=totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numberFlowers,flower,budget-totalPrice);
        }else{
            System.out.printf("Not enough money, you need %.2f leva more.",totalPrice-budget);
        }
    }
}
