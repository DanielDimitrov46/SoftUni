package Exam;

import java.util.Scanner;

public class P03CourierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double packageWeight = Double.parseDouble(scanner.nextLine());
        String typeOfContract = scanner.nextLine();
        int kilometres = Integer.parseInt(scanner.nextLine());
        double pricePerKilometer = 0;
        double totalPrice = 0;
        double addedPrice = 0;
        double allAddedExpenses = 0;

        if (packageWeight < 1) {
            pricePerKilometer = 0.03;
        } else if (packageWeight >= 1 && packageWeight < 10) {
            pricePerKilometer = 0.05;
        } else if (packageWeight >= 10 && packageWeight < 40) {
            pricePerKilometer = 0.10;
        } else if (packageWeight >= 40 && packageWeight < 90) {
            pricePerKilometer = 0.15;
        } else {
            pricePerKilometer = 0.20;
        }
        if (typeOfContract.equals("standard")) {
            totalPrice = pricePerKilometer * kilometres;
        } else {
            totalPrice = pricePerKilometer * kilometres;
            if (packageWeight < 1) {
                addedPrice = 0.80 * pricePerKilometer;
            } else if (packageWeight == 1 && packageWeight < 10) {
                addedPrice = 0.40 * pricePerKilometer;
            } else if (packageWeight >= 10 && packageWeight < 40) {
                addedPrice = 0.05 * pricePerKilometer;
            } else if (packageWeight >= 40 && packageWeight < 90) {
                addedPrice = 0.02 * pricePerKilometer;
            } else {
                addedPrice = 0.01 * pricePerKilometer;
            }
            addedPrice = packageWeight*addedPrice;
            allAddedExpenses = addedPrice*kilometres;
            totalPrice = totalPrice+allAddedExpenses;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",packageWeight,totalPrice);

    }
}

