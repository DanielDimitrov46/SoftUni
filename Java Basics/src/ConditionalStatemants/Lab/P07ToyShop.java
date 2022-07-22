package ConditionalStatemants.Lab;

import java.util.Scanner;

public class P07ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOfExcursion = Double.parseDouble(scanner.nextLine());
        int numberOfPuzzles = Integer.parseInt(scanner.nextLine());
        int numberOfDolls = Integer.parseInt(scanner.nextLine());
        int numbersOfBears = Integer.parseInt(scanner.nextLine());
        int numberOfMinions = Integer.parseInt(scanner.nextLine());
        int numberOfTrucks = Integer.parseInt(scanner.nextLine());
        double profitFromSold = numberOfPuzzles * 2.60 + numberOfDolls * 3 + numbersOfBears * 4.10 + numberOfMinions * 8.20 + numberOfTrucks * 2;
        int numberOfToys = numbersOfBears + numberOfPuzzles + numberOfDolls + numberOfTrucks + numberOfMinions;
        if (numberOfToys >= 50) {
            profitFromSold = profitFromSold - (profitFromSold * 0.25);
        }
        double realProfit = profitFromSold - (profitFromSold * 0.10);
        if (realProfit>=priceOfExcursion){
            double leftMoney = realProfit-priceOfExcursion;
            System.out.printf("Yes! %.2f lv left.",leftMoney);
        }else{
            double leftMoney = priceOfExcursion-realProfit;
            System.out.printf("Not enough money! %.2f lv needed.",leftMoney);
        }

    }
}
