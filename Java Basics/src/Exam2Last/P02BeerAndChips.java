package Exam2Last;

import java.util.Scanner;

public class P02BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfFan = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfBottles = Integer.parseInt(scanner.nextLine());
        int numberOfPacketOfChips = Integer.parseInt(scanner.nextLine());

        double priceOfBeer = 1.20*numberOfBottles;
        double priceOfChips = 0.45*priceOfBeer;
        double totalPriceOfChips = Math.ceil(priceOfChips*numberOfPacketOfChips);
        double totalSum = priceOfBeer+totalPriceOfChips;
        if(totalSum<=budget){
            System.out.printf("%s bought a snack and has %.2f leva left.\n",nameOfFan,budget-totalSum);
        }else{
            System.out.printf("%s needs %.2f more leva!",nameOfFan,totalSum-budget);
        }
    }
}
