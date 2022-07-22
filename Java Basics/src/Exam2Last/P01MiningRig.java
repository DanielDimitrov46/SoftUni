package Exam2Last;

import java.util.Scanner;

public class P01MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceOfVideoCard = Integer.parseInt(scanner.nextLine());
        int priceOfAdapter = Integer.parseInt(scanner.nextLine());
        double priceOfElectricityForDayFromCard = Double.parseDouble(scanner.nextLine());
        double profitFromOneCardForOneDay = Double.parseDouble(scanner.nextLine());

        int allCards = priceOfVideoCard*13;
        int allAdapters = priceOfAdapter*13;
        int totalPrice = allCards+allAdapters+1000;
        double profitForOne = profitFromOneCardForOneDay-priceOfElectricityForDayFromCard;
        double allProfit = profitForOne*13;
        double forPeriod = Math.ceil(totalPrice/allProfit);
        System.out.printf("%d%n",totalPrice);
        System.out.printf("%.0f",forPeriod);
    }
}
